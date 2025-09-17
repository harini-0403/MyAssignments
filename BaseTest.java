package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    // ThreadLocal ensures each test thread gets its own WebDriver
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public WebDriver getDriver() {
        return tlDriver.get();
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        tlDriver.set(driver);
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
        tlDriver.remove();
    }
}
