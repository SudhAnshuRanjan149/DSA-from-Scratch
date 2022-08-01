// Question

// Paint Fence

// Easy  Prev   Next

// 1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
// 2. You are required to calculate and print the number of ways in which the fences could be painted so that not more than two consecutive  fences have same colors.

// Input Format
// A number n
// A number k

// Output Format
// A number representing the number of ways in which the fences could be painted so that not more than two fences have same colors.

// Constraints
// 1 <= n <= 10
// 1 <= k <= 10

// Sample Input
// 8
// 3

// Sample Output
// 3672

// ************************************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class PaintFence {

    public static void main(String[] args) throws Exception {
        Scanner scn =  new Scanner(System.in);
        
        int fences =  scn.nextInt();
        int colors =  scn.nextInt();
        
		// no of ways for 2 fences defined here
        int lastTwoSame = colors;
        int lastTwoDiff = colors * (colors - 1);
        int total = lastTwoSame + lastTwoDiff;
        
        for(int fence = 3; fence <= fences; fence++){
            //System.out.println(lastTwoSame + " - " +lastTwoDiff + " - " + total);
            lastTwoSame = lastTwoDiff;
            lastTwoDiff = total * (colors - 1);
            total = lastTwoSame + lastTwoDiff;
        }
        
        System.out.println(total);
        
    }
}