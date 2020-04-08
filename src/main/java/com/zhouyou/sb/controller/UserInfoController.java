package com.zhouyou.sb.controller;

import com.github.pagehelper.PageInfo;
import com.zhouyou.sb.core.RetResponse;
import com.zhouyou.sb.core.RetResult;
import com.zhouyou.sb.entity.UserInfo;
import com.zhouyou.sb.service.UserInfoService;
import io.swagger.annotations.*;
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


}