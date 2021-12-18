package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
    public static void main(String[] args) {
        WebDriver driver;
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password")  ;
        //save expected url before clicking button
        String expectedURL = driver.getCurrentUrl();
        // click on to retrieve password
    WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
    retrievePasswordButton.click();
    //save actual url after clicking button
    String actualURL = driver.getCurrentUrl();
    //verify that url did not change
        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");

        }
        driver.quit();
    }

}
