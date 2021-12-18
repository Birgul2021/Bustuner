package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //maximize the window
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up")  ;

        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Birgul Ustuner With TagName ");

    }
}
