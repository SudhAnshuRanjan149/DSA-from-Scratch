// Question

// Fibonacci-dp

// Easy

// 1. You are given a number n.
// 2. You are required to print the nth element of fibonnaci sequence.

// Note -> Notice precisely how we have defined the fibonnaci sequence
// 0th element -> 0
// 1st element -> 1
// 2nd element -> 1
// 3rd element -> 2
// 4th element -> 3
// 5th element -> 5
// 6th element -> 8

// Input Format
// A number n

// Output Format
// A number representing the nth element of fibonnaci sequence

// Constraints
// 0 <= n <= 45

// Sample Input
// 10

// Sample Output
// 55


// ************************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class Fibonacci_dp {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n =  scn.nextInt();
    
    int ans = fibonacci(n);
    System.out.println(ans);
    
    int [] dp = new int[n+1]; 
    int ans2 = fibonacciByDP(n,dp);
    System.out.println(ans2);
    
  }
  public static int fibonacciByDP(int n,int [] dp){
    if(n == 0 || n == 1){
        return n;
    }
    
    if(dp[n] != 0){
        return dp[n];
    }
    
    int nm1 = fibonacciByDP(n-1,dp);
    int nm2 = fibonacciByDP(n-2,dp);
    
    dp[n] = nm1 + nm2;
    
    return nm1 + nm2;
  }
  public static int fibonacci(int n){
    if(n == 0 || n == 1){
        return n;
    }
    
    int nm1 = fibonacci(n-1);
    int nm2 = fibonacci(n-2);
      
    return nm1 + nm2;
  }

}

