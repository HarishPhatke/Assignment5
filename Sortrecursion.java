//Sort an array using a recursive algorithm.

package com.demo.assignment5;

import java.util.Scanner;

public class Sortrecursion {

	public static void main(String[] args) {

		int n, i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		sortArray(a, n);
		for (i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}

	public static void sortArray(int a[], int n) {
		int maxIndex, t;
		if (n > 1) {
			maxIndex = getmaxIndex(a, n);
			t = a[n - 1];
			a[n - 1] = a[maxIndex];
			a[maxIndex] = t;
			sortArray(a, n - 1);
		}
	}

	public static int getmaxIndex(int a[], int n) {
		int max, maxIndex, i;
		max = a[0];
		maxIndex = 0;
		for (i = 1; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
				maxIndex = i;
			}

		}
		return (maxIndex);
	}

}
