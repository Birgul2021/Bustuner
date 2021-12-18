package com.cybertek.tests.tests.day7_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {

    @BeforeMethod
    public void setUp(){
        System.out.println("open the browser");
    }
    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals(" title", "title");
        
        System.out.println("Second Assertion");
        Assert.assertEquals("url", "url");

    }
@AfterMethod
    public void tearDown(){
    System.out.println("close the browser");
}
}
