package com.ron.test.boottester.controller;

import com.ron.test.boottester.model.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author feikong
 * @version 2022/1/21
 */
@RestController
public class TestController {

    @GetMapping("/api/welcome")
    public Result<String> welcome(){
        return Result.ok("hello ecs");
    }
}
