package com.spark.springbootdemo;

public class M {
    @Override
    protected void finalize()
    {
        System.out.println("finalize");
    }
}
