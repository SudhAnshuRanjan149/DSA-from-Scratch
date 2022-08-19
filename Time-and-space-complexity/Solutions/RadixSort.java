// Question

// Radix Sort

// Easy

// 1. You are given an array(arr) of integers.
// 2. You have to sort the given array in increasing order using radix sort.

// Input Format
// An Integer n 
// arr1
// arr2..
// n integers

// Output Format
// Check the sample ouput and question video.

// Constraints
// 1 <= N <= 10000
// 0 <= arr[i] <= 10^8

// Sample Input
// 5
// 7 
// 2 
// 4 
// 1 
// 3

// Sample Output
// After sorting on 1 place -> 1 2 3 4 7 
// 1 2 3 4 7 


// ************************************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class RadixSort {

  public static void radixSort(int[] arr) {
    // write code here    
    int max = Integer.MIN_VALUE;
    
    for(int val : arr){
        if(val > max){
            max = val;
        }
    }
    
    int exp = 1;
    
    while(exp <= max){
        countSort(arr,exp);
        exp *= 10;
    }
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    // Create frequency array
    int [] farr = new int[10];
    
    // Fill frequency array
    for(int i = 0; i < arr.length; i++){
        farr[arr[i] / exp % 10]++;
    }
    
    // Convert freq arr into prefix sum array
    for(int i = 1; i < farr.length; i++){
        farr[i] = farr[i] + farr[i - 1];
    }
    
    // create answer array
    int [] ans = new int[arr.length];
    
    // fill answer array
    for(int i = arr.length - 1; i >= 0; i--){
        int idx = farr[arr[i]/exp % 10] - 1;
        ans[idx] = arr[i];
        farr[arr[i]/exp % 10]--;
    }
    
    // Update original array
    for(int i = 0; i < ans.length; i++){
        arr[i] = ans[i];
    }
    
        System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}