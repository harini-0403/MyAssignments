package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondParallelTest extends BaseTest {

    @Test
    public void openWikipedia() {
        getDriver().get("https://www.wikipedia.org/");
        String title = getDriver().getTitle();
        System.out.println("Thread " + Thread.currentThread().getId() +
                " → SecondParallelTest Title: " + title);
        Assert.assertTrue(title.contains("Wikipedia"));
    }
}
