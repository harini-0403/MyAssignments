package com.example.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class FrameAlertAutomation {
    public static void main(String[] args) {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize window and set wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the URL
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

        // Switch to the frame
        driver.switchTo().frame("iframeResult");

        // Click the "Try it" button
        WebElement tryItButton = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryItButton.click();

        // Handle the alert (prompt)
        Alert alert = driver.switchTo().alert();
        String name = "Harini"; // input to prompt
        alert.sendKeys(name);
        alert.accept();  // Use alert.dismiss() for Cancel

        // Verify text
        WebElement demoText = driver.findElement(By.id("demo"));
        String result = demoText.getText();

        if (result.contains(name)) {
            System.out.println("✅ Test Passed: " + result);
        } else {
            System.out.println("❌ Test Failed: " + result);
        }

        // Close browser
        driver.quit();
    }
}
