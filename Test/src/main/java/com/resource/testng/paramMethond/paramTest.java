package com.resource.testng.paramMethond;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramTest {
    @Test
    @Parameters({"name","age"})
    public void paramnum(String name ,int age){
        System.out.println("name:" +name +"," +"age:"+age);
    }
}
