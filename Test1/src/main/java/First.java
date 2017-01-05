package com.isensen.test;

/**
 * Created by i33 on 2016-12-29.
 */
public class First implements IFirst {

    private String a = "c";

    public static void main(String... args) {
        System.out.print("Hello world!");
    }


    @Override
    public String test(Params params) {
        return params.getA();
    }


    @Override
    public String test2() {

        return a;
    }


}
