package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KpTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.kp.ru/daily/27423/4623243/");



        driver.findElement(By.xpath("//button[@data-is-small-on-mobile]")).click();
        driver.findElement(By.xpath("//input[@placeholder='E-mail']")).sendKeys("jhhgfd@mail.ru");
        driver.findElement(By.xpath("//button[text()='Отправить']")).sendKeys("Отправить");

        Thread.sleep(5000);
        driver.quit();

    }



    }

