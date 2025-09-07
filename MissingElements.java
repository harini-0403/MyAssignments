package com.example.tasks;
import java.util.*;

public class MissingElements {
    public static void main(String[] args) {
        // Input array with missing numbers
        Integer[] arr = {1, 2, 3, 4, 10, 6, 8};

        // Convert array into a List
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Sort the list in ascending order
        Collections.sort(list); // Now [1, 2, 3, 4, 6, 8, 10]

        // Create a list to hold missing numbers
        List<Integer> missing = new ArrayList<>();

        // Loop through list elements to find gaps
        for (int i = 0; i < list.size() - 1; i++) {
            int cur = list.get(i);     // current number
            int next = list.get(i + 1); // next number
            // If numbers between cur and next are missing → add them
            for (int m = cur + 1; m < next; m++) {
                missing.add(m);
            }
        }

        // Print missing numbers
        System.out.println("Missing: " + missing); // Output: [5, 7, 9]
    }
}
