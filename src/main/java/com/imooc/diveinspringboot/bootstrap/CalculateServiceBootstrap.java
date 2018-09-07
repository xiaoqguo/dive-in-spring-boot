package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.service.CalculaterService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

//引导类
@SpringBootApplication(scanBasePackages = "com.imooc.diveinspringboot.service")
public class CalculateServiceBootstrap {
    @Override
    public String toString(){
        return "";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run(args);
        CalculaterService calculaterService = context.getBean(CalculaterService.class);
        System.out.println("calculate result is:"+calculaterService.sum(1,2,3,4,5,6,7,8,9));
        context.close();
    }
}
