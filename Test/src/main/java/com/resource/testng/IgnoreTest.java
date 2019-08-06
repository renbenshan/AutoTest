package com.resource.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test(enabled = false)
    public void ignore1(){
        System.out.println("ignore1执行啦！！");
    }
    @Test
    public void ignore2(){
        System.out.println("ignore2执行啦！！");
    }

}
