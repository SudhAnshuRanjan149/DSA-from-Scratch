// Question

// Count Binary Strings

// Easy

// 1. You are given a number n.
// 2. You are required to print the number of binary strings of length n with no consecutive 0's.
// Input Format
// A number n
// Output Format
// A number representing the number of binary strings of length n with no consecutive 0's.

// Constraints
// 0 < n <= 45

// Sample Input
// 6

// Sample Output
// 21

// ************************************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class CountBinaryStrings{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    
    int UsingZero = 1;
    int UsingOne = 1;
    
    for(int i = 2; i <= n; i++){
        int nextUsingZeros = UsingOne;
        int nextUsingOnes = UsingZero + UsingOne;
        
        UsingZero = nextUsingZeros;
        UsingOne = nextUsingOnes;
    }
    
    System.out.println(UsingOne + UsingZero);
 }

}