package com.cybertek.tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.getTitle();
       if(driver.getTitle().equals("Amazon.com. Spend less. Smile more.")){
            System.out.println(true);}else{
           System.out.println(false);
       }
       driver.navigate().to("https://www.youtube.com");
       driver.get("https://www.youtube.com");
           if(driver.getTitle().equals("YouTube")){
               System.out.println(true);
           }else
           {
               System.out.println(false);
    }
 driver.navigate().to("https://www.amazon.com");

driver.navigate().refresh();
driver.close();

}}
