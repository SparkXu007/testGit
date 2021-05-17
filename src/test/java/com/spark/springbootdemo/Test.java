package com.spark.springbootdemo;


import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @org.junit.Test
    public void getRandom6(){
        double random = Math.random();

        System.out.println((int)(random*1000));

    }

    @org.junit.Test
    public void testString(){
       String a = "abc";
       String b = "abc";

       String c = "a";

        System.out.println(a == b);
        System.out.println(a == c+"bc");
        System.out.println("abc" == "a"+"bc");
    }
}
