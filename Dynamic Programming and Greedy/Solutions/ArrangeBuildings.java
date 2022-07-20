// Question

// Arrange Buildings

// Easy

// 1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
// 2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
// 3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.

// Input Format
// A number n

// Output Format
// A number representing the number of ways in which the buildings can be built on both side of roads.

// Constraints
// 0 < n <= 45

// Sample Input
// 6

// Sample Output
// 441

// ************************************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class ArrangeBuildings{

public static void main(String[] args) throws Exception {
    // write your code here
        // write your code here
    Scanner scn = new Scanner(System.in);
    
    int n = scn.nextInt();
    
    long usingBuilding = 1;
    long usingSpace = 1;
    
    for(int i = 2; i <= n; i++){
        long nextUsingBuildings = usingSpace;
        long nextUsingSpaces = usingBuilding + usingSpace;
        
        usingBuilding = nextUsingBuildings;
        usingSpace = nextUsingSpaces;
    }
    
    long totalOnOneSide =  usingBuilding + usingSpace;
    
    System.out.println(totalOnOneSide * totalOnOneSide);
 }

}