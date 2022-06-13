//Question

// Factorial

// Easy

// 1. You are given a number n.
// 2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Input Format
// A number n

// Output Format
// factorial of n

// Constraints
// 0 <= n <= 10

// Sample Input
// 5

// Sample Output
// 120

// ************************************************************************************
// Solution



package Solutions;

import java.io.*;
import java.util.*;

public class Factorial {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n =  scn.nextInt();
    
    int ans  = factorial(n);
    System.out.println(ans);
  }

  public static int factorial(int n) {
     if(n == 0 || n == 1){
         return 1;
     }
      
    int fmn1 = factorial(n - 1);
    int ans = fmn1 * n;
    return ans;
  }

}