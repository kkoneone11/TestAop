package com.kkoneone.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author : huangzhengyi.hzy@alibaba-inc.com
 * @Date : 2024/8/12 19:05
 * @Description:
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Plus {
    String value() default "";
}
