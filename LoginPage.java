package com.example.tasks;

public class LoginPage extends BasePage {
    // Override performCommonTasks() from BasePage
    @Override
    public void performCommonTasks() {
        System.out.println("LoginPage: performing login-specific tasks");
    }

    public static void main(String[] args) {
        // Create object of BasePage
        BasePage bp = new BasePage();
        bp.performCommonTasks(); // Calls BasePage method

        // Create object of LoginPage
        LoginPage lp = new LoginPage();
        lp.performCommonTasks(); // Calls overridden method
    }
}
