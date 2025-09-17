package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConvertedTest extends BaseTest {

    @Test
    public void examplePageTitleTest() {
        // Step 1: Open the page
        driver.get("https://example.com");

        // Step 2: Capture the page title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Step 3: Verify the title
        Assert.assertTrue(title.contains("Example Domain"),
                "Page title did not contain 'Example Domain'");
    }
}
