package com.zhouyou.sb.controller;

import com.github.pagehelper.PageInfo;
import com.zhouyou.sb.core.RetResponse;
import com.zhouyou.sb.core.RetResult;
import com.zhouyou.sb.core.ServiceException;
import com.zhouyou.sb.entity.UserInfo;
import com.zhouyou.sb.service.UserInfoService;
import io.swagger.annotations.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserInfo)表控制层
 *
 * @author makejava
 * @since 2020-04-07 11:31:23
 */
@RestController
@RequestMapping("userInfo")
@Api(tags = {"用户操作接口"}, value = "UserInfoController")
public class UserInfoController {
    /**
     * 服务对象
     */
    @Resource
    private UserInfoService userInfoService;

    Logger logger = LoggerFactory.getLogger(UserInfoController.class);
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询用户", notes = "根据用户ID查询用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true,
                    dataType = "Integer", paramType = "query")
    })
    @GetMapping("selectOne")
    public RetResult<UserInfo> selectOne(@RequestParam String id) {
        UserInfo userInfo = this.userInfoService.queryById(id);
        logger.info("123456");
        return RetResponse.result(userInfo);
    }

    @ApiOperation(value = "异常测速")
    @PostMapping("/testException")
    public RetResult<UserInfo> testException(@RequestParam String id){
        //List a = null;
        //a.size();
        UserInfo userInfo = userInfoService.queryById(id);
        return RetResponse.result(userInfo);
    }


    @ApiOperation(value = "查询用户", notes = "分页查询用户所有")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "当前页码",
                    dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "size", value = "每页显示条数",
                    dataType = "Integer", paramType = "query"),
            @ApiImplicitParam(name = "userName", value = "查询名词",
                    dataType = "String", paramType = "query")
    })
    @PostMapping("/selectAll")
    public RetResult<PageInfo<UserInfo>> selectAll(@RequestParam(defaultValue = "1") Integer page,
                                                   @RequestParam(defaultValue = "10") Integer size,
                                                   @RequestParam(name = "userName",required = false) String userName) {
        PageInfo<UserInfo> pageInfo = userInfoService.selectQuery(page, size,userName);
        return RetResponse.result(pageInfo);
    }

    @PostMapping("/login")
    @ApiOperation("登录")
    public RetResult<UserInfo> login(String userName, String password){

        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(new UsernamePasswordToken(userName,password));
        } catch (IncorrectCredentialsException e) {
            throw new ServiceException("密码错误");
        }
        //从session取出信息
        UserInfo userInfo = (UserInfo)subject.getPrincipal();

        return RetResponse.result(userInfo);
    }


}