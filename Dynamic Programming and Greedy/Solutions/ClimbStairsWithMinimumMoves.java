// Question

// Climb Stairs With Minimum Moves

// Easy

// 1. You are given a number n, representing the number of stairs in a staircase.
// 2. You are on the 0th step and are required to climb to the top.
// 3. You are given n numbers, where ith element's value represents - till how far from the step you 
//      could jump to in a single move.  You can of-course fewer number of steps in the move.
// 4. You are required to print the number of minimum moves in which you can reach the top of 
//      staircase.
// Note -> If there is no path through the staircase print null.

// Input Format
// A number n
// .. n more elements

// Output Format
// A number representing the number of ways to climb the stairs from 0 to top.

// Constraints
// 0 <= n <= 20
// 0 <= n1, n2, .. <= 20

// Sample Input
// 10
// 3
// 3
// 0
// 2
// 1
// 2
// 4
// 2
// 0
// 0

// Sample Output
// 4


// ************************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class ClimbStairsWithMinimumMoves {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int [] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }


    int [] dp = new int[n + 1];

    dp[n] = 0;

    for (int i = n - 1; i >= 0; i--) {
      int min = n;
      for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {

        if (dp[i + j] < min) {
          min = dp[i + j];
        }
      }
      dp[i]  = min + 1;
    }
    
    System.out.println(dp[0]);
  }

}