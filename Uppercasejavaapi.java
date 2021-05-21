//Convert a user inputted string to uppercase by using java APIs.

package com.demo.assignment5;

import java.util.Scanner;

public class Uppercasejavaapi {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		str = s.nextLine();
		System.out.println(str.toUpperCase());

	}

}
