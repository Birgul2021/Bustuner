package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.co.uk/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium");

        WebElement clickButton = driver.findElement(By.id("nav-search-submit-button"));
        clickButton.click();
        WebElement expectedTestInput = driver.findElement(By.partialLinkText("selenium"));
        String expectedText = "1-48 of 264 results for selenium";



    }
}