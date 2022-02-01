package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {


    public static void main(String[] args) throws InterruptedException {

        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();


        //2- Create instance of the Selenium Webdriver
        // This is the line opening an empty browser
        WebDriver driver= new ChromeDriver();


        //3- Go to ("https://www.tesla.com");
        driver.get("https://www.tesla.com");


        //stop code execution for 3 sec
        Thread.sleep(3000);


        //use selenium to navigate back
        driver.navigate().back();






    }




}
