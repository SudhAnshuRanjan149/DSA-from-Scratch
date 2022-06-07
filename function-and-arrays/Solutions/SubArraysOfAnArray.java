//Question

// 1. You are given an array of size 'n' and n elements of the same array.
// 2. You are required to find and print all the subarrays of the given array. 
// 3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.

// Input Format
// A number n
// n1
// n2
// .. n number of elements

// Output Format
// [Tab separated elements of subarray]
// ..
// All subarrays

// Constraints
// 1 <= n <= 10
// 0 <= n1, n2
//  .. n elements <= 10 ^9

// Sample Input
// 3
// 10
// 20
// 30

// Sample Output
// 10	
// 10	20	
// 10	20	30	
// 20	
// 20	30	
// 30	

// ***********************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class SubArraysOfAnArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    int [] a = new int[n];
    
    for(int i = 0; i < n; i++){
        a[i] = scn.nextInt();
    }
    
    printAllSubArrays(a);
 }
 public static void printAllSubArrays(int [] a){
     for(int i = 0; i < a.length; i++){
         for(int j = i; j < a.length;j++){
             for(int k = i; k <= j;k++){
                System.out.print(a[k] + "\t"); 
             }
             System.out.println();
         }
         
     }
 }

}