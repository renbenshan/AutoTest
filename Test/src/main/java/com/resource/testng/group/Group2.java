package com.resource.testng.group;

import org.testng.annotations.Test;
/*groups后面的值是和xml文件中的include值相对应的*/
@Test(groups = "techer")
public class Group2 {
    public void groupontech(){
        System.out.println("这是老师的组");
    }
}
