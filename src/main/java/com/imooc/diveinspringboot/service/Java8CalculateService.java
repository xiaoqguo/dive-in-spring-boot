package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

//Java8 Lambda实现
@Profile("Java8")
@Service
public class Java8CalculateService implements CalculaterService{
    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java8 Lambda 实现");
        int sum = 0;
        Stream.of(values).reduce(0,Integer::sum);
        return sum;
    }
}
