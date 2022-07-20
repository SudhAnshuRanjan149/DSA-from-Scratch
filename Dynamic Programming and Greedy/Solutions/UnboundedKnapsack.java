// Question

// Unbounded Knapsack

// Easy

// 1. You are given a number n, representing the count of items.
// 2. You are given n numbers, representing the values of n items.
// 3. You are given n numbers, representing the weights of n items.
// 3. You are given a number "cap", which is the capacity of a bag you've.
// 4. You are required to calculate and print the maximum value that can be created in the bag without 
//     overflowing it's capacity.
// Note -> Each item can be taken any number of times. You are allowed to put the same item again 
//                   and again.

// Input Format
// A number n
// v1 v2 .. n number of elements
// w1 w2 .. n number of elements
// A number cap

// Output Format
// A number representing the maximum value that can be created in the bag without overflowing it's capacity

// Constraints
// 1 <= n <= 20
// 0 <= v1, v2, .. n elements <= 50
// 0 < w1, w2, .. n elements <= 10
// 0 < cap <= 10

// Sample Input
// 5
// 15 14 10 45 30
// 2 5 1 3 4
// 7

// Sample Output
// 100


// ********************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class UnboundedKnapsack {

  public static void main(String[] args) throws Exception {
// Take inputs
    Scanner scn =  new Scanner(System.in);

    int n = scn.nextInt();

    int [] value = new int[n];

    for (int i = 0; i < n; i++) {
      value[i] = scn.nextInt();
    }

    int [] weight = new int[n];

    for (int i = 0; i < n; i++) {
      weight[i] = scn.nextInt();
    }

    int capacity = scn.nextInt();


    // Solution


    int [] dp = new int[capacity + 1];
    dp[0] = 0;

    for (int weightIndex = 0; weightIndex < weight.length; weightIndex++) {
      for (int cap = 1; cap < dp.length; cap++) {
        if(cap >= weight[weightIndex] && dp[cap] < value[weightIndex] + dp[cap - weight[weightIndex]]){
            dp[cap] = value[weightIndex] + dp[cap - weight[weightIndex]];
        }
      }
    }

    System.out.println(dp[dp.length - 1]);
  }
}