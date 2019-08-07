package com.resource.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groupclasses {
    @Test(groups = "test1")
    public void test1(){
        System.out.println("这是test1的组");
    }
    @Test(groups = "test2")
    public void test2(){
        System.out.println("2的组");
    }
    @BeforeGroups("test1")
    public void beforegroup(){
        System.out.println("这是beforegroup");
    }
    @AfterGroups("test1")
    public void Aftergroup(){
        System.out.println("这是Aftergroup");
    }
}
