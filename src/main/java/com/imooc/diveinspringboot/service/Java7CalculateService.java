package com.imooc.diveinspringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Java7 for 循环实现
@Profile("Java7")//装配条件
@Service
public class Java7CalculateService implements CalculaterService {
    @Override
    public Integer sum(Integer... values) {
        System.out.println("Java7 for循环实现");
        int sum = 0;
        for(int i=0;i<values.length;i++){
            sum += values[i];
        }
        return sum;
    }
}
