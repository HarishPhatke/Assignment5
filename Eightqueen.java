//Solve the eight queen’s problem.

package com.demo.assignment5;

import java.util.Scanner;

public class Eightqueen {
	static int n;

	public static void main(String[] args) {
		int i, f;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of the board");
		n = s.nextInt();
		int[] a = new int[51];
		for (i = 1; i <= n; i++) {
			a[i] = 1;
		}
		i = 1;
		while (true) {
			for (i = 1; i <= n; i++) {
				f = check(i, a[i]);
				if (f != 0) {
					a[i] = f;
				} else {
					a[i] = 1;
					a[i - 1] = a[i - 1] + 1;
					i = i - 2;
				}
			}
			for (i = 1; i <= n; i++) {
				for (f = 1; f <= n; f++) {
					if (f == a[i]) {
						System.out.print("Q");
					} else {
						System.out.print("-");
					}
				}
				System.out.println("");
			}
			System.out.println("[");
			for (i = 1; i < n; i++) {
				System.out.println(a[i]);
			}
			System.out.println(a[n]);
			System.out.println("solution for size" + n);
			a[n] = a[n] + 1;
			i = n;
		}

	}

	public static int check(int x, int y) {
		int i;
		int[] a = new int[51];
		for (i = 1; i < x; i++) {
			if ((a[i] == y) || (i - a[i] == x - y) || (i - x == y - a[i])) {
				y = y + 1;
				i = 0;
			}
		}
		if (y > n)
			return 0;
		else
			return y;

	}

}
