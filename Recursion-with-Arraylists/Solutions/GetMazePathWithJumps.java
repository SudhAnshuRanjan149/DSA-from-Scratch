// Question

// Get Maze Path With Jumps

// Easy

// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.

// Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

// Input Format
// A number n
// A number m

// Output Format
// Contents of the arraylist containing paths as shown in sample output

// Constraints
// 0 <= n <= 10
// 0 <= m <= 10

// Sample Input
// 2
// 2

// Sample Output
// [h1v1, v1h1, d1]

// *********************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class GetMazePathWithJumps{

  public static void main(String[] args) throws Exception {
    Scanner scn =  new Scanner(System.in);

    int n = scn.nextInt();
    int m = scn.nextInt();

    ArrayList<String> ans =  getMazePaths(1, 1, n, m);

    System.out.println(ans);
  }

  // sr - source row
  // sc - source column
  // dr - destination row
  // dc - destination column
  public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    if (sr == dr && sc == dc) {
      ArrayList<String> paths = new ArrayList<>();
      paths.add("");
      return paths;
    }




    ArrayList<String> paths = new ArrayList<>();

    // ms --> move size
    //hpaths
    for (int ms = 1; ms <= dc - sc; ms++) {
      ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);

      for (String hpath : hpaths) {
        paths.add("h" + ms + hpath);
      }
    }

    //vpaths
    for (int ms = 1; ms <= dr - sr; ms++) {
      ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);

      for (String vpath : vpaths) {
        paths.add("v" + ms + vpath);
      }
    }

    //dpaths
    for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
      ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);

      for (String dpath : dpaths) {
        paths.add("d" + ms + dpath);
      }
    }


    return paths;
  }

}