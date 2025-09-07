package com.example.tasks;
import java.util.*;

public class FindIntersection {
    public static void main(String[] args) {
        // Declare two arrays
        int[] a = {3, 2, 11, 4, 6, 7};
        int[] b = {1, 2, 8, 4, 9, 7};

        // Convert array a into a List
        List<Integer> listA = new ArrayList<>();
        for (int v : a) listA.add(v);

        // Convert array b into a List
        List<Integer> listB = new ArrayList<>();
        for (int v : b) listB.add(v);

        // Create a list to store common elements
        List<Integer> common = new ArrayList<>();

        // Compare each element in listA with each element in listB
        for (Integer x : listA) {
            for (Integer y : listB) {
                // If they are equal and not already in common list → add
                if (x.equals(y) && !common.contains(x)) {
                    common.add(x);
                }
            }
        }

        // Print intersection elements
        System.out.println("Intersection: " + common); // Output: [2, 4, 7]
    }
}
