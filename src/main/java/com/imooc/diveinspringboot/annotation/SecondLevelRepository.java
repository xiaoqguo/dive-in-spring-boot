package com.imooc.diveinspringboot.annotation;
//二级 Repository
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository1
public @interface SecondLevelRepository {
    String value() default "";
}
