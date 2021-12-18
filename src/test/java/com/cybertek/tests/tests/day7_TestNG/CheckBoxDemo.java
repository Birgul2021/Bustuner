package com.cybertek.tests.tests.day7_TestNG;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxDemo {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("CHROME");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//INPUT[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//INPUT[2]"));

        System.out.println("checkbox1.isSelected = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected = " + checkbox2.isSelected());

        Assert.assertFalse(checkbox1.isSelected(), "verify checkbox 1 is NOT selected");
        Assert.assertTrue(checkbox2.isSelected(), "verify checkbox 2 is selected");
        checkbox1.click();
        //verify after click

        Assert.assertTrue(checkbox1.isSelected(), "verify checkbox 1 is selected");
        Assert.assertTrue(checkbox2.isSelected(), "verify checkbox 2 is selected");

        Thread.sleep(2000);
        driver.quit();
    }
}
