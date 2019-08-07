package com.resource.testng;

import org.testng.annotations.Test;

public class DenpendTest {
    @Test
    public void test1(){
        System.out.println("test1 run!!");
        throw new RuntimeException();
    }
//    被依赖的方法执行失败了，执行方法直接被忽略！！*/
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run!!");
    }
}
