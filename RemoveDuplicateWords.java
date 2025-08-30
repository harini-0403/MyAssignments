package com.assignment.week1;

import java.util.HashSet;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
       
        String text = "We learn Java basics as part of java sessions in java week1";
        
        
        String[] words = text.split(" ");
        
       
        HashSet<String> uniqueWords = new HashSet<>();
        
        StringBuilder result = new StringBuilder();
        
        
        for (String word : words) {
            if (uniqueWords.add(word.toLowerCase())) { // Add the word to the set (case-insensitive)
                result.append(word).append(" ");
            }
        }
        
        
        System.out.println(result.toString().trim());
    }
}
