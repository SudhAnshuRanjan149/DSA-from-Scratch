// Question

// String Compression

// Easy

// 1. You are given a string. 
// 2. You have to compress the given string in the following two ways - 
//    First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
//    For "aaabbccdee", the compressed string will be "abcde".
//    Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
//    For "aaabbccdee", the compressed string will be "a3b2c2de2".

// Input Format
// A String

// Output Format
// Two strings representing first compressed string and second compressed string respectively.

// Constraints
// 1 <= length of string <= 1000

// Sample Input
// wwwwaaadexxxxxx

// Sample Output
// wadex
// w4a3dex6


// **********************************************************************************
// Solution

package Solutions;

import java.io.*;
import java.util.*;

public class StringCompression {

	public static String compression1(String str){
		// write your code here
		char ch = str.charAt(0);
		String s = "";
		s += ch;
		
		for(int i = 1; i < str.length(); i++ ){
		    if(str.charAt(i) != ch){
		        ch = str.charAt(i);
		        s += ch;
		    }
		}

		return s;
	}

	public static String compression2(String str){
		// write your code here
	    char ch = str.charAt(0);
		String s = "";
		s += ch;
		int count = 1;
		
		for(int i = 1; i < str.length(); i++ ){
		    if(str.charAt(i) != ch){
		    	ch = str.charAt(i);         
		      	if(count != 1) s += count;
		      	s += ch;
		      	count = 0;
		    }
		    count++;
		}
		
		if(count > 1) s += count;

		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}