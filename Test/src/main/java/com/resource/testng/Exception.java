package com.resource.testng;

import org.testng.annotations.Test;

public class Exception {
    /**
     * */
    @Test(expectedExceptions = RuntimeException.class)
    public void runtestExceptionFailed(){
        System.out.println("这是运行失败的用例！！");
        throw new RuntimeException();
    }
}
