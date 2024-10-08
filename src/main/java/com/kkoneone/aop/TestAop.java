package com.kkoneone.aop;

import com.kkoneone.annotation.*;
import com.kkoneone.core.JoinPoint;
import com.kkoneone.core.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;


//@Aop(jointPath = "com.kkoneone.aop.*")
@Aop(jointAnnotationClass = Plus.class)
@Configurable
public class TestAop {

    @Around
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前置拦截器");
//        final Object ret = joinPoint.invoke();
        System.out.println("环绕通知后置拦截器");
        //对应切点的方法
        return null;

    }

    @Before
    public void before(JoinPoint joinPoint){
        Plus plus = joinPoint.getAnnotation(Plus.class);
        if(plus != null) {
            System.out.println(plus.value());
        }
        System.out.println("before");
    }

//    @Throwing
//    public void throwing(){
//        System.out.println("出异常了.....");
//    }
    @After
    public void after(JoinPoint joinPoint){
        final Object returnValue = joinPoint.getArgs();
        System.out.println("after");
    }




}
