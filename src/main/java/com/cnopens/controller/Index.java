package com.cnopens.controller;

import com.cnopens.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: Index
 * @Description: function desc
 * @Author cnopens
 * @Date 2020/9/16 下午5:52
 * @Copyright Dashuo
 **/
@RestController
@RequestMapping("/api/v1")
public class Index {

    @RequestMapping("/index")
    public Result getIndex() {

        return Result.result(200, "ok", "helloworld");

    }
}
