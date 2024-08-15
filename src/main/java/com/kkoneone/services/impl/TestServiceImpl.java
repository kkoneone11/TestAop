package com.kkoneone.services.impl;

import com.kkoneone.aop.Plus;
import com.kkoneone.services.TestService;
import org.springframework.stereotype.Service;



@Service
public class TestServiceImpl implements TestService {

    @Plus("plus")
    public void testService1(){
        System.out.println("测试开始111");
    }


}
