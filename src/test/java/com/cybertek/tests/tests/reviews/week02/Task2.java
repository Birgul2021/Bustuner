package com.cybertek.tests.tests.reviews.week02;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
//go to https://www.demoblaze.com/index.html#
//    Navigate to Laptops Category
//    Then Sony vaio i7 laptop
//    Verify the product price is 790 Dollars

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.demoblaze.com/index.html");

        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Sony vaio i7")).click();

        Thread.sleep(3000);
        int expectedPrice =790;
        WebElement priceTextElement = driver.findElement(By.tagName("h3"));

        String priceText= priceTextElement.getText();
        System.out.println("priceText = " + priceText);

        String arr[]= priceText.split(" ");
        //arr[0]= $790
        int actualPrice = Integer.parseInt(arr[0].substring(1));
        System.out.println("Actual and Expected price is same: " + (expectedPrice==actualPrice));
    }
}
