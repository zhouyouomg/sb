package com.zhouyou.sb.controller;

import com.zhouyou.sb.core.RetResponse;
import com.zhouyou.sb.core.RetResult;
import com.zhouyou.sb.service.RedisService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("redis")
public class RedisController {

    @Resource
    private RedisService redisService;

    @PostMapping("/setRedis")
    public RetResult<String> setRedis(String name) {
        redisService.set("name",name);
        return RetResponse.result(name);
    }

    @PostMapping("/getRedis")
    public RetResult<String> getRedis() {
        String name = redisService.get("name");
        return RetResponse.result(name);
    }
}
