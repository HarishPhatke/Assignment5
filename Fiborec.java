//Print the Fibonacci series using recursion.

package com.demo.assignment5;

import java.util.Scanner;

public class Fiborec {

	public static void main(String[] args) {
		int n, i = 0, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number upto which you want series");
		n = sc.nextInt();
		for (c = 1; c <= n; c++) {
			System.out.println(Fibonacci(i));
			i++;
		}

	}

	public static int Fibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return (Fibonacci(n - 1) + Fibonacci(n - 2));
	}

}
