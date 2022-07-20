// Question

// Zero One Knapsack

// Easy

// 1. You are given a number n, representing the count of items.
// 2. You are given n numbers, representing the values of n items.
// 3. You are given n numbers, representing the weights of n items.
// 3. You are given a number "cap", which is the capacity of a bag you've.
// 4. You are required to calculate and print the maximum value that can be created in the bag without 
//      overflowing it's capacity.

// Note -> Each item can be taken 0 or 1 number of times. You are not allowed to put the same item 
//                again and again.

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
// 75

// ************************************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class ZeroOneKnapsack {

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

    int cap = scn.nextInt();


    // Solution

    int [][] dp = new int[weight.length + 1][cap + 1];

    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[0].length; j++) {
        if (i == 0 || j == 0) {
          dp[i][j] = 0;
        }
        else if (j >= weight[i - 1] && dp[i - 1][j] <=  value[i - 1] + dp[i - 1][j - weight[i - 1]]) {
          dp[i][j] = value[i - 1] + dp[i - 1][j - weight[i - 1]];
        }
        else {
          dp[i][j] = dp[i - 1][j];
        }
      }
    }

    System.out.println(dp[dp.length - 1][dp[0].length - 1]);
  }
}