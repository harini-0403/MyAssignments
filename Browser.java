package com.assignment.week1;

public class Browser {
    // Method with parameter
    public void launchBrowser(String browserName) {
        System.out.println(browserName + " launched successfully");
    }

    // Method returning String
    public String loadUrl() {
        return "Url loaded successfully";
    }

    // Main method to test Browser
    public static void main(String[] args) {
        Browser br = new Browser();  // Create object
        br.launchBrowser("Chrome");  // Call method
        System.out.println(br.loadUrl());  // Call method
    }
}
