package com.imooc.diveinspringboot.repository;

import com.imooc.diveinspringboot.annotation.FirstLevelRepository;
import com.imooc.diveinspringboot.annotation.SecondLevelRepository;
import org.springframework.stereotype.Component;

//@FirstLevelRepository(value="myFirstLevelRepository")//bean 的名称
//@Component(value="myFirstLevelRepository")
@SecondLevelRepository(value="myFirstLevelRepository")
public class MyFirstLevelRepository {
}
