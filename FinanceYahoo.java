package com.assignment.finance;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;

public class FinanceYahoo {

    public static void main(String[] args) {
        
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER); // don't wait for all ads/scripts
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        // timeout for page load
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            // Open Yahoo Finance Crypto page
            driver.get("https://finance.yahoo.com/crypto");
            System.out.println("Page loaded: " + driver.getTitle());

            // Wait for table to appear
            WebElement table = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//table"))
            );

            // Extract and print cryptocurrency names
            List<WebElement> rows = table.findElements(By.tagName("tr"));
            System.out.println("----- Cryptocurrency Names -----");
            for (WebElement row : rows) {
                List<WebElement> cols = row.findElements(By.tagName("td"));
                if (cols.size() >= 2) {
                    String cryptoName = cols.get(1).getText().trim();
                    if (!cryptoName.isEmpty()) {
                        System.out.println(cryptoName);
                    }
                }
            }
            System.out.println("--------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 4: Close the browser
            driver.quit();
        }
    }
}
