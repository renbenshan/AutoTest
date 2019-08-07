package com.resource.testng.paramMethond;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+"，age="+age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"benshan",10},
                {"lili",20}
        };
        return o;
    }

    @Test(dataProvider = "1")
    public void test1(String name,int age){
        System.out.println("test1方法："+"name:"+name+"   age"+age);
    }

    @Test(dataProvider ="1" )
    public void test2(String name,int age){
        System.out.println("test2方法："+"name"+name+"   age"+age);
    }
    @DataProvider(name = "1")
    public Object[][] provider(Method method) {
        Object[][] reult = null;
        if (method.getName().equals("test1")) {
            reult = new Object[][]{
                    {"大本山test1",25}
            };
        } else if (method.getName().equals("test2")) {
            reult = new Object[][]{
                    {"大箱子",28}
            };
        }
        return reult;
    }
}
