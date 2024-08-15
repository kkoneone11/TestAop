package com.kkoneone.controller;


import com.kkoneone.aop.Plus;
import com.kkoneone.services.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class test {
    @Autowired
    private TestServiceImpl testService;

    @RequestMapping("/test1")
    public String test1(){
        testService.testService1();
        return "ok";
    }




}
