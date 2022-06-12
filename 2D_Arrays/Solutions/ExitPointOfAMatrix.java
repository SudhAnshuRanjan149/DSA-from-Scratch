// Question

// Exit Point Of A Matrix

// Easy

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
// 4. Consider this array a maze and a player enters from top-left corner in east direction.
// 5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
// 6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.

// Input Format
// A number n
// A number m
// e11
// e12..
// e21
// e22..
// .. n * m number of elements

// Output Format
// row
// col (of the point of exit)

// Constraints
// 1 <= n <= 10^2
// 1 <= m <= 10^2
// e1, e2, .. n * m elements belongs to the set (0, 1)

// Sample Input
// 4
// 4
// 0
// 0
// 1
// 0
// 1
// 0
// 0
// 0
// 0
// 0
// 0
// 0
// 1
// 0
// 1
// 0

// Sample Output
// 1
// 3

// *************************************************************************************
// Solution

package Solutions;

import java.io.*;
import java.util.*;

public class ExitPointOfAMatrix {

	public static void main(String[] args) throws Exception {
		// write your code here

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int m = scn.nextInt();

		int[][] arr = new int[n][m];

		// take input for 2d Array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = scn.nextInt();
			}
		}

		// Code-1
		// int [] ans = new int[2];
		// ans = findExitPointOfAMatrix(arr);

		// System.out.println(ans[0]);
		// System.out.println(ans[1]);

		// Code-2
		printExitPointOfAMatrix(arr);

	}

	public static void printExitPointOfAMatrix(int[][] a) {
		int i = 0;
		int j = 0;

		// dir --> 0 = east , 1 = south , 2 = west , 3 = north
		int dir = 0;

		// 00 01 02
		// 10 11 12
		// 20 21 22

		while (true) {
			dir = (a[i][j] + dir) % 4;
			if (dir == 0) {
				j++;
			} else if (dir == 1) {
				i++;
			} else if (dir == 2) {
				j--;
			} else if (dir == 3) {
				i--;
			}

			if (i < 0) {
				i++;
				break;
			} else if (j < 0) {
				j++;
				break;
			} else if (i == a.length) {
				i--;
				break;
			} else if (j == a[0].length) {
				j--;
				break;
			}
		}

		System.out.println(i);
		System.out.println(j);
	}

	public static int[] findExitPointOfAMatrix(int[][] a) {

		int maxr = a.length;
		int maxc = a[0].length;

		int minr = 0;
		int minc = 0;

		int row = 0;
		int col = 0;

		int count = a.length * a[0].length;

		int[] ans = new int[2];

		while (count > 0) {

			while (a[row][col] != 1 && count > 0) {
				col++;
				count--;
				if (col >= maxc) {
					ans[0] = row;
					ans[1] = --col;
					return ans;
				}
			}
			row++;

			while (a[row][col] != 1 && count > 0) {
				row++;
				count--;
				if (row >= maxr) {
					ans[0] = --row;
					ans[1] = col;
					return ans;
				}
			}
			col--;

			while (a[row][col] != 1 && count > 0) {
				col--;
				count--;
				if (col < minc) {
					ans[0] = row;
					ans[1] = ++col;
					return ans;
				}
			}
			row--;

			while (a[row][col] != 1 && count > 0) {
				row--;
				count--;
				if (row < minr) {
					ans[0] = ++row;
					ans[1] = col;
					return ans;
				}
			}
			col++;

		}
		ans[0] = -1;
		ans[1] = -1;
		return ans;
	}

}