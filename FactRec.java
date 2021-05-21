//Calculate the factorial of a number using recursion.

package com.demo.assignment5;

import java.util.Scanner;

public class FactRec {

	public static void main(String[] args) {
		int n, f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for knowing its factorial");
		n = sc.nextInt();
		f = GetFactorial(n);
		System.out.println(n + "! is equal to" + f);

	}

	public static int GetFactorial(int n) {
		if (n > 0) {
			return n * GetFactorial(n - 1);
		} else {
			return 1;
		}

	}

}
