package cn.wqgallery.myaop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
@Target(ElementType.METHOD)//设置在什么上使用注解 METHOD为方法
@Retention(RetentionPolicy.RUNTIME)//设置注解什么环境运行  RUNTIME为运行时
public @interface Login {
}
