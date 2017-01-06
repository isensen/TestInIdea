package com.isensen.test;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by i33 on 2017-01-05.
 * 一个典型的单元测试包含三个步骤:
 * 1) 准备测试类及数据
 * 2) 执行要测试的行为
 * 3) 检查结果
 */
public class HelloWorldTest {

    @Test
    public void testSayHello(){
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello Maven",result);
    }
}
