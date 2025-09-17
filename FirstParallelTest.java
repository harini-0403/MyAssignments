package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstParallelTest extends BaseTest {

    @Test
    public void openExampleDotCom() {
        getDriver().get("https://example.com");
        String title = getDriver().getTitle();
        System.out.println("Thread " + Thread.currentThread().getId() +
                " → FirstParallelTest Title: " + title);
        Assert.assertTrue(title.contains("Example Domain"));
    }
}
