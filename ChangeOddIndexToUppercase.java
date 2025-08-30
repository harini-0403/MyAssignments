package com.assignment.week1; // Optional, if you're using a package

public class ChangeOddIndexToUppercase {
    public static void main(String[] args) {
        
        String test = "changeme";

        
        char[] charArray = test.toCharArray();
        
        
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 != 0) {  // Check if the index is odd
                charArray[i] = Character.toUpperCase(charArray[i]);  // Change to uppercase
            }
        }

     
        System.out.println(new String(charArray));
    }
}
