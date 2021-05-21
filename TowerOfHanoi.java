//Solve the Towers of Hanoi problem using recursion.

package com.demo.assignment5;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of disk");
		n = sc.nextInt();
		Hanoi(n, 'A', 'C', 'B');
		return;

	}

	public static void Hanoi(int n, char Start, char End, char aux) {

		if (n == 1) {
			System.out.print(Start);
			System.out.println(End);
			return;
		}
		Hanoi(n - 1, Start, aux, End);

		System.out.println(n);
		System.out.println(Start);
		System.out.println(End);
		Hanoi(n - 1, aux, Start, End);

	}

}
