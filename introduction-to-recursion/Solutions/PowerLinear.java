//Question

// Power-linear

// Easy

// 1. You are given a number x.
// 2. You are given another number n.
// 3. You are required to calculate x raised to the power n. Don't change the signature of power function .

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Input Format
// A number x
// A number n

// Output Format
// x raised to the power n

// Constraints
// 1 <= x <= 10
// 0 <= n <= 9

// Sample Input
// 2
// 5

// Sample Output
// 32


// ************************************************************************************
// Solution


package Solutions;

import java.io.*;
import java.util.*;

public class PowerLinear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        
        int x = scn.nextInt();
        int n =  scn.nextInt();
        
        int ans = power(x,n);
        
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return x;
        }
        
        int xrnm1 = power(x,n-1);
        int ans = x * xrnm1;
        return ans;
    }

}