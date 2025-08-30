package com.assignment.week1;


	import java.util.Arrays; 

	public class FindMissingElement {
	    public static void main(String[] args) {
	     
	        int[] arr = {1, 4, 3, 2, 8, 6, 7}; 

	      
	        Arrays.sort(arr);

	       
	        for (int i = 0; i < arr.length; i++) {
	            
	            if (arr[i] != i + 1) {
	                System.out.println("The missing element is: " + (i + 1));
	                break; 
	            }
	        }
	    }
	}
