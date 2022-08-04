package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VkTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://vk.com/");

        driver.findElement(By.xpath("//input[@placeholder='Телефон или почта']")).sendKeys("89234567198");
        driver.findElement(By.xpath("//button[@class='FlatButton FlatButton--primary FlatButton--size-l FlatButton--wide VkIdForm__button VkIdForm__signInButton']")).click();
        //driver.findElement(By.xpath("//input[@id='otp']")).sendKeys("12345");
        //driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(5000);
        driver.quit();


    }
}
