package com.assignment.windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingDemo {

    public static void main(String[] args) {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        try {
            // Open W3Schools Tryit page
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
            System.out.println("Parent window title: " + driver.getTitle());

            // Switch to iframe containing the button
            driver.switchTo().frame("iframeResult");

            // Click button to open new window
            WebElement button = driver.findElement(By.tagName("button"));
            button.click();

            // Store parent window handle
            String parentWindow = driver.getWindowHandle();

            // Switch to child window
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    System.out.println("Child window title: " + driver.getTitle());
                    driver.close(); // Close child window
                }
            }

            // Switch back to parent window
            driver.switchTo().window(parentWindow);
            System.out.println("Back to parent window: " + driver.getTitle());

        } finally {
            driver.quit(); // Close all windows
        }
    }
}
