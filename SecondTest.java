package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test
    public void openWikipedia() {
        driver.get("https://www.wikipedia.org/");
        String title = driver.getTitle();
        System.out.println("SecondTest Title: " + title);
        Assert.assertTrue(title.contains("Wikipedia"),
                "Title did not match for Wikipedia");
    }
}
