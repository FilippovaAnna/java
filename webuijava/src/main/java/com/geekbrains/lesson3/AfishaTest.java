package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AfishaTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.afisha.ru/");


        driver.findElement(By.xpath("//button[@data-test='BUTTON FILTERS-BUTTON text']")).click();
        driver.findElement(By.xpath("//div[@data-test='DROPDOWN-SECTION']")).click();
        //driver.findElement(By.xpath("//a[@href='/movie/211453/']"));
        driver.findElement(By.xpath("//div[text()='Найти']")).click();

        Thread.sleep(5000);
        driver.quit();

    }
}
