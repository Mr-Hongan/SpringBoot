package com.lha.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desrciption
 * @Author Lu.Hongan
 * @Date Created on 2017-12-09 18:43
 */
@RestController
public class TestController {
    @RequestMapping("/index")
    @ResponseBody
    public String getString(){
        return "hello SpringBoot";
    }
}
