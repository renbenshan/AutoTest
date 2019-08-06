package com.resource.testng.Suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteconfig {
    @BeforeSuite
    public void beforSuit(){
        System.out.println("这里是beforeSuite运行！！");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("这是aftersuite运行啦！！");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("这是beforetest");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("这里是aftertets");
    }

}
