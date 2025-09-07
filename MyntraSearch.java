package com.example.tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class MyntraSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            driver.get("https://www.myntra.com/");
            System.out.println("✅ Opened Myntra");

            // 🔍 Search for bags
            WebElement searchBox = wait.until(
                    ExpectedConditions.elementToBeClickable(By.className("desktop-searchBar")));
            searchBox.sendKeys("bags");
            searchBox.sendKeys(Keys.ENTER);
            System.out.println("✅ Searched for bags");

            // ✅ Apply Gender → Men filter
            WebElement menFilter = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Men')]")));
            menFilter.click();
            System.out.println("✅ Applied Men filter");

            // ⏳ Wait for product list
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("li.product-base")));
            List<WebElement> products = driver.findElements(By.cssSelector("li.product-base"));
            System.out.println("📦 Total products found for Men: " + products.size());

            // 🏷 Print brands + names safely
            Set<String> uniqueBrands = new HashSet<>();
            System.out.println("\n--- Product List ---");

            for (int i = 0; i < products.size(); i++) {
                try {
                    // re-fetch product each time to avoid stale element
                    WebElement product = driver.findElements(By.cssSelector("li.product-base")).get(i);

                    String brand = product.findElement(By.cssSelector("h3")).getText();
                    String title = product.findElement(By.cssSelector("h4")).getText();

                    uniqueBrands.add(brand);
                    System.out.println(brand + " - " + title);

                } catch (StaleElementReferenceException e) {
                    System.out.println("⚠️ Skipped a product due to stale element.");
                }
            }

            // Print unique brands
            System.out.println("\n--- Unique Brands ---");
            for (String brand : uniqueBrands) {
                System.out.println(brand);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
