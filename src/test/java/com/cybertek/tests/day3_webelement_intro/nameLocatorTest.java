package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up")  ;
        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Birgul Ustuner");
     //make browser fullscreen
         driver.manage().window().maximize();
     //put some email and click sign up button
         WebElement emailInput = driver.findElement(By.name("email"));
         emailInput.sendKeys("birgulustuner@hotmail.com");

         WebElement signupbutton = driver.findElement(By.name("wooden_spoon"));
         signupbutton.click();
     //lazy way
        //driver.findElement(By.name("wooden_spoon")).click();

    }
}
