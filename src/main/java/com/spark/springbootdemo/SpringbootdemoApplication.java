package com.spark.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 */
@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootdemoApplication.class, args);

        String[] beanDefinitionNames = run.getBeanDefinitionNames();

        for (String name: beanDefinitionNames) {
            System.out.println(name);
        }
    }

}
