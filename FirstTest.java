package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void openExampleDotCom() {
        driver.get("https://example.com");
        String title = driver.getTitle();
        System.out.println("FirstTest Title: " + title);
        Assert.assertTrue(title.contains("Example Domain"),
                "Title did not match for Example.com");
    }
}
