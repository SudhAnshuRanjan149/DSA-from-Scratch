// Question

// Get Subsequence

// Easy

// 1. You are given a string str.
// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
// Use sample input and output to take idea about subsequences.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
// Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Input Format
// A string str

// Output Format
// Contents of the arraylist containing subsequences as shown in sample output


// Constraints
// 0 <= str.length <= 20

// Sample Input
// abc

// Sample Output
// [, c, b, bc, a, ac, ab, abc]


// *********************************************************************************
// Solution


import java.io.*;
import java.util.*;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        
        String str = scn.nextLine();
        
        ArrayList<String> arrl =  gss(str);
        
        
        System.out.println(arrl);
        
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> pans = new ArrayList<String>();
            pans.add(str);
            return pans;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        ArrayList<String> pans = gss(ros);
        ArrayList<String> ans = new ArrayList<String>();
        
        for(String subStr : pans){
            ans.add(subStr);
        }
        for(String subStr : pans){
             ans.add(ch + subStr);
        }
        
        return ans;
    }

}