package com.spark.springbootdemo;

import java.io.IOException;

public class TestGC {
    public static void main(String[] args) throws IOException {
        M m = new M();
        m = null;

        System.gc();

        System.in.read();
    }
}
