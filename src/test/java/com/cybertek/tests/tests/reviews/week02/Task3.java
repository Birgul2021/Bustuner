package com.cybertek.tests.tests.reviews.week02;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        Thread.sleep(2000);

        WebElement searchBox = driver.findElement(By.xpath("//*[@id='searchInput']"));
        searchBox.sendKeys("selenium web-driver");
        Thread.sleep(2000);
        WebElement clickButton = driver.findElement(By.id("searchButton"));
        clickButton.click();
        WebElement searchResult = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[3]/ul/li[1]/div[1]/a"));

          searchResult.click();

        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        if(actualUrl.endsWith("Selenium_(software)")){
            System.out.println("pass");

        }else{
            System.out.println("fail");


        }
    }
}
