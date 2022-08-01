// Question

// Merge Two Sorted Arrays

// Easy

// 1. You are given two sorted arrays(a,b) of integers.
// 2. You have to merge them and form one sorted array.
// 3. You have to do it in linear time complexity.

// Input Format
// An Integer n 
// a1
// a2..n integers
// An integer m
// b1
// b2..m integers

// Output Format
// Check the sample output and question video.

// Constraints
// 1 <= N <= 10^8
// -10^9 <= a[i],b[i] <= 10^9

// Sample Input
// 4
// -2 
// 5 
// 9 
// 11
// 3
// 4 
// 6 
// 8

// Sample Output
// -2
// 4
// 5
// 6
// 8
// 9
// 11

// ************************************************************************************************
// Solution

import java.io.*;
import java.util.*;

public class MergeTwoSortedArrays {

	// Merge Two Sorted Arrays -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
	public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
		// write your code here
		int[] c = new int[a.length + b.length];
		int j = 0;
		int k = 0;
		for (int i = 0; i < c.length; i++) {
			while (j < a.length && k < b.length) {
				if (a[j] < b[k]) {
					c[i] = a[j];
					j++;
					i++;
				} else {
					c[i] = b[k];
					k++;
					i++;
				}
			}
			while (j < a.length) {
				c[i] = a[j];
				j++;
				i++;
			}
			while (k < b.length) {
				c[i] = b[k];
				k++;
				i++;
			}
		}
		return c;
	}
	// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
	public static void display(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");
		}
		System.out.println(" ]");
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scn.nextInt();
		}
		int m = scn.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = scn.nextInt();
		}
		int[] mergedArray = mergeTwoSortedArrays(a, b);
		print(mergedArray);
	}

}