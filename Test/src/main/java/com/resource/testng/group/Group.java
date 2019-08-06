package com.resource.testng.group;

import org.testng.annotations.Test;

@Test(groups = "student")
public class Group {
    public void groupsstu(){
        System.out.println("这里是groupstu的运行");
    }
}
