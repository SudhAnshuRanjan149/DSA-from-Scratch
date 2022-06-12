// Questions

// Print All Palindromic Substrings

// Easy

// 1. You are given a string. 
// 2. You have to print all palindromic substrings of the given string.

// Input Format
// A String

// Output Format
// All palindromic substrings(one in a line).
// First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

// Constraints
// 1 <= length of string <= 500

// Sample Input
// abcc

// Sample Output
// a
// b
// c
// cc
// c

// **************************************************************************************

// Solution

import java.io.*;
import java.util.*;

public class PrintAllPalindromicSubstrings {

	public static void solution(String str){
		//write your code here
		for(int i = 0; i <= str.length(); i++){
		    for(int j = i+1; j <= str.length(); j++){
		        String os = str.substring(i,j);
		       
		      // Method-1
		      //  String rs = ReverseString(os);
		      //  System.out.println("-->"+os+"-->"+rs);
		      //  if(os.equals(rs)){
		      //      System.out.println(os);
		      //  }
		      
		      // Method-2
		      if(isPalindrome(os)){
		          System.out.println(os);
		      }
		    }
		}
		
	}
	
	// Method-2
	public static boolean isPalindrome(String str){
	    int i = 0;
	    int j = str.length() - 1;
	    
	    while(i < j){
	        char ch1 = str.charAt(i);
	        char ch2 = str.charAt(j);
	        
	        if(ch1 != ch2){
	            return false;
	        }else{
	            i++;
	            j--;
	        }
	    }
	    return true;
	}
	
	// Method-1
	public static String ReverseString(String str){
	    String s = "";
	    
	    for(int i = str.length()-1; i >= 0; i--){
	        s += str.charAt(i);
	    }
	    return s;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}