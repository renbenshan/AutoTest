package com.resource.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCaes1(){
        System.out.println("这是测试用例1");
    }
    @BeforeMethod
    public void beforeMethond(){
        System.out.println("这是测试方法：beforemethond");
    }
    @AfterMethod
    public void afterMethond(){
        System.out.println("这是测试方法:afterMethond");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是类运行之前：beforeclass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是类运行之后：aftercalss");
    }
}
