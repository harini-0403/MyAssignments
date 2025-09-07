package com.example.tasks;
import java.util.*;

public class OrderCompanies {
    public static void main(String[] args) {
        // Create list of company names
        List<String> companies = new ArrayList<>(Arrays.asList("HCL","Wipro","Aspire Systems","CTS"));

        // Sort list alphabetically (ascending order)
        Collections.sort(companies);

        // Reverse list to get descending order
        Collections.reverse(companies);

        // Print sorted list
        System.out.println("Ordered: " + companies); 
        // Output: [Wipro, HCL, CTS, Aspire Systems]
    }
}
