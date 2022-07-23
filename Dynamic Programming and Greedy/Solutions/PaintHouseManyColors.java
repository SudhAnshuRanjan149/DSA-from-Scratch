// Question

// Paint House - Many Colors

// Easy

// 1. You are given a number n and a number k separated by a space, representing the number of houses and number of colors.
// 2. In the next n rows, you are given k space separated numbers representing the cost of painting nth house with one of the k colors.
// 3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.

// Input Format
// A number n
// n1-0th n1-1st n1-2nd .. n1-kth
// n2-0th n2-1st n2-2nd .. n2-kth
// .. n number of elements

// Output Format
// A number representing the minimum cost of painting all houses without painting any consecutive house with same color.

// Constraints
// 1 <= n <= 1000
// 1 <= k <= 10
// 0 <= n1-0th, n1-1st, .. <= 1000

// Sample Input
// 4 3
// 1 5 7
// 5 8 4
// 3 2 9
// 1 2 4

// Sample Output
// 8

// ************************************************************************************************
// Solution

// Time --> O(N^2) , Space --> O(1)

import java.io.*;
import java.util.*;

public class PaintHouseManyColors {

	public static void main(String[] args) throws Exception {

		// Take inputs
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int k = scn.nextInt();

		int[][] arr = new int[n][k];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		// display(arr);

		int min1 = 0;
		int min2 = 0;

		for (int i = 0; i < arr.length; i++) {
			int nmin1 = Integer.MAX_VALUE;
			int nmin2 = Integer.MIN_VALUE;
			for (int j = 0; j < arr[0].length; j++) {
				if (i != 0) {
					// change array
					if (min1 != arr[i - 1][j]) {
						arr[i][j] += min1;
					} else {
						arr[i][j] += min2;
					}
				}

				// set first and second minima
				if (nmin1 > arr[i][j]) {
					nmin2 = nmin1;
					nmin1 = arr[i][j];
				} else if (nmin2 > arr[i][j]) {
					nmin2 = arr[i][j];
				}

			}
			min1 = nmin1;
			min2 = nmin2;

			// System.out.println(min1 + " - " + min2);
		}

		System.out.println(min1);

	}

	static void display(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}