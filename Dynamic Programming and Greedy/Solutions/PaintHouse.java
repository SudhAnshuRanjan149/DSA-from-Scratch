// Question

// Paint House

// Easy  Prev   Next

// 1. You are given a number n, representing the number of houses.
// 2. In the next n rows, you are given 3 space separated numbers representing the cost of painting nth house with red or blue or green color.
// 3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.

// Input Format
// A number n
// n1red n1blue n1green
// n2red n2blue n2green
// .. n number of elements

// Output Format
// A number representing the minimum cost of painting all houses without painting any consecutive house with same color.

// Constraints
// 1 <= n <= 1000
// 0 <= n1red, n1blue, .. <= 1000

// Sample Input
// 4
// 1 5 7
// 5 8 4
// 3 2 9
// 1 2 4

// Sample Output
// 8

// ************************************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class PaintHouse {

  public static void main(String[] args) throws Exception {

    // Take inputs
    Scanner scn =  new Scanner(System.in);

    int n = scn.nextInt();

    int [][] arr = new int[n][3];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    
    // display(arr);

    int red = arr[0][0];
    int blue = arr[0][1];
    int green = arr[0][2];

    // Solution
    for (int i = 1; i < arr.length; i++) {
        int nred = red;
        int nblue = blue;
        int ngreen = green;
      for (int j = 0; j < arr[0].length; j++) {
        if (j == 0) {
          nred = arr[i][j] + Math.min(blue, green);
        } else if (j ==  1) {
          nblue = arr[i][j] + Math.min(red, green);
        } else {
          ngreen = arr[i][j] + Math.min(red, blue);
        }
      }
        red = nred;
        blue = nblue;
        green = ngreen;
      
      //System.out.println(red + " - " + blue + " - " +green);
    }

    int min = Math.min(red, blue);
    min = Math.min(min, green);

    System.out.println(min);
  }

  static void display(int [][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}