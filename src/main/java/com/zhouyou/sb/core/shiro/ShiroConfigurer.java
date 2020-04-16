package com.zhouyou.sb.core.shiro;

import com.zhouyou.sb.entity.SysPermissionInit;
import com.zhouyou.sb.service.SysPermissionInitService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.subject.Subject;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
public class ShiroConfigurer {


    @Resource
    private SysPermissionInitService sysPermissionInitService;

    /**
     * 注入自定义的realm，告诉shiro如何获取用户信息来做登录或权限控制
     */
    @Bean
    public Realm realm(){
        return new CustomRealm();
    }

    @Bean
    public static DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator(){
        DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
        /**
         * setUsePrefix(false)用于解决一个奇怪的bug。在引入spring aop的情况下。
         * 在@Controller注解的类的方法中加入@RequiresRole注解，会导致该方法无法映射请求，导致返回404。
         * 加入这项配置能解决这个bug
         */
        creator.setUsePrefix(true);
        return creator;
    }

    /**
     * 这里统一做鉴权，即判断哪些请求路径需要用户登录，哪些请求路径不需要用户登录
     * @return
     */
    @Bean
    public ShiroFilterChainDefinition shiroFilterChainDefinition() {
        DefaultShiroFilterChainDefinition chain = new DefaultShiroFilterChainDefinition();
        /*chain.addPathDefinition( "/userInfo/selectById", "authc, roles[admin]");
        chain.addPathDefinition( "/logout", "anon");
        chain.addPathDefinition( "/userInfo/selectAll", "anon");
        chain.addPathDefinition( "/userInfo/login", "anon");
        chain.addPathDefinition( "/**", "authc");
        chain.addPathDefinition( "/userInfo/selectById", "authc, roles[cw]");*/


        List<SysPermissionInit> list = sysPermissionInitService.selectAllOrderBySort();

        for(int i = 0,length = list.size();i<length;i++){
            SysPermissionInit sysPermissionInit = list.get(i);
            chain.addPathDefinition(sysPermissionInit.getUrl(), sysPermissionInit.getPermissionInit());
        }
        return chain;
    }

    @Bean
    public SessionManager sessionManager(){
        return new MySessionManager();
    }

    //@Override
    //登录方法
    public Map<String, Object> userLogin(String userName, String password) {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.login(new UsernamePasswordToken(userName, password));
        //从session取出用户信息
        //UserInfo user = (UserInfo) currentUser.getPrincipal();
        Map<String,Object> map = new HashMap<>(3);
        map.put("sessionId",currentUser.getSession().getId());
        return map;
    }

}
