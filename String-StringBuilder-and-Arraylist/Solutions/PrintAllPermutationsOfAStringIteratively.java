// Question

// Print All Permutations Of A String Iteratively

// Easy

// 1. You are given a string. 
// 2. You have to print all permutations of the given string iteratively.

// Input Format
// A String

// Output Format
// All permutations of the given string(one in a line). 

// Constraints
// 1 <= length of string <= 15

// Sample Input
// abc

// Sample Output
// abc
// bac
// cab
// acb
// bca
// cba



// **********************************************************************************
// Solution

package Solutions;

import java.io.*;
import java.util.*;

public class PrintAllPermutationsOfAStringIteratively {

	public static void solution(String str){
		// write your code here
		int fact = factorial(str.length());
		
		for(int i = 0; i < fact; i++){
		    int div = str.length();
		    StringBuilder temp = new StringBuilder(str);
		    StringBuilder ans = new StringBuilder();
		    
		    int dividend = i;
		    while(div > 0){
		        int rem = dividend % div;
		        dividend /= div; 
		        div--;
		        
		        ans.append(temp.charAt(rem));
		        temp.deleteCharAt(rem);
		    }
		    System.out.println(ans);
		    
		}
		
	}
	
	public static int factorial(int n){
	   if(n == 1 || n == 0){
	       return 1;
	   }
	   
	   int factnm1 = factorial(n - 1);
	   int fact  = n * factnm1;
	   
	   return fact;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}