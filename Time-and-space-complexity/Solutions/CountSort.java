// Question

// Count Sort

// Easy

// 1. You are given an array(arr) of integers.
// 2. You have to sort the given array in increasing order using count sort.

// Input Format
// An Integer n 
// arr1
// arr2..
// n integers

// Output Format
// Check the sample ouput and question video.

// Constraints
// 1 <= N <= 10000
// -10^8 <= arr[i] <= 10^8

// Sample Input
// 5
// 7 
// -2 
// 4 
// 1 
// 3

// Sample Output
// -2
// 1
// 3
// 4
// 7

// ****************************************************************
// Solution

import java.io.*;
import java.util.*;

public class CountSort {

  public static void countSort(int[] arr, int min, int max) {
    //write your code here
    int range = max - min + 1;

    //Frequency Array
    int [] freqArr = new int[range];

    //fill frequency Array
    for (int i = 0; i < arr.length; i++) {
      int idx =  arr[i] - min;
      freqArr[idx]++;
    }


    //convert frequency array into Position Array
    for (int i = 1; i < freqArr.length; i++) {
      freqArr[i] = freqArr[i] + freqArr[i - 1];
    }

    int [] ans = new int[arr.length];
    
    // Fill Answer Array
    for(int i = arr.length-1; i >= 0; i--){
        int val = arr[i];
        int pos = freqArr[val - min];
        int idx = pos - 1;
        ans[idx] = val;
        freqArr[val - min]--;
    }
    
    // Update Original Array
    for(int i = 0; i < ans.length;i++){
        arr[i] = ans[i];
    }
    
    

  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr, min, max);
    print(arr);
  }

}