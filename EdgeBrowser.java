package com.assignment.week1;

public class EdgeBrowser {
    public static void main(String[] args) {
        Browser br = new Browser();  // Using Browser class
        br.launchBrowser("Edge");
        System.out.println(br.loadUrl());
    }
}
