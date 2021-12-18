package com.cybertek.tests.tests.day7_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

    @Test
    public void test1(){
        System.out.println("My First Test Case");

    }
    @Test
    public void test2(){
        System.out.println("second test case");
    }
@BeforeMethod
    public void setUp(){
    System.out.println("WebDriver,Opening Browser");
}
@AfterMethod
    public void tearDown(){
    System.out.println("Closing Browser, Quit");
}
}
