package com.assignment.week1;


public class ReverseOddWords {
    public static void main(String[] args) {
       
        String test = "I am a software tester";
        
        
        String[] words = test.split(" ");
       
        for (int i = 0; i < words.length; i++) {
            
            if (i % 2 != 0) {
                words[i] = new StringBuilder(words[i]).reverse().toString(); // Reverse the word
            }
        }
        
        
        String result = String.join(" ", words);
        
       
        System.out.println(result);
    }
}
