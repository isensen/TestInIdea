package com.isensen.test;
/**
 * Created by i33 on 2017-01-05.
 */
public class HelloWorld {
    public String sayHello(){
        return  "Hello Maven";
    }

    public static void main(String... args){
        System.out.println(new HelloWorld().sayHello());
    }
}
