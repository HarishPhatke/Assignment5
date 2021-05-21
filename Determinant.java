//Solve a (n x n) determinant using recursion.

package com.demo.assignment5;

import java.util.Scanner;

public class Determinant {

	public static void main(String[] args) {
		int d, i, j, k;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the order of determinant ");
		k = s.nextInt();

		int[][] a = new int[10][10];
		for (i = 0; i <= k - 1; i++) {
			for (j = 0; j <= k - 1; j++) {
				a[i][j] = s.nextInt();
			}
		}
		d = determinant(a, k);
		System.out.println(d);

	}

	public static int determinant(int[][] a, int k) {

		int det, c, s = 1, i, j, m, n;
		int[][] b = new int[10][10];

		if (k == 1) {
			return (a[0][0]);
		} else {
			det = 0;
		}
		for (c = 0; c <= k - 1; c++) {
			m = 0;
			n = 0;
			for (i = 0; i < k; i++) {
				for (j = 0; j < k; j++) {
					b[i][j] = 0;
					if (i != 0 && j != c) {
						b[m][n] = a[i][j];
						if (n < (k - 2)) {
							n++;
						} else {
							n = 0;
							m++;
						}
					}
				}
			}
			det = det + s * (a[0][c] * determinant(b, k - 1));
			s = -1 * s;
		}
		return (det);
	}

}
