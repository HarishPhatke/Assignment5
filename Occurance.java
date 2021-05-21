//A program takes two strings as input, say str1 and str2. List down the occurrences of str2 in 
//str1, using java APIs.

package com.demo.assignment5;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
		String str1, str2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first string");
		str1 = s.next();
		System.out.println("Enter the second string");
		str2 = s.next();
		System.out.println("Count of occurrences of a substring recursively are: " + subsrting_rec(str1, str2));
	}

	static int subsrting_rec(String str1, String str2) {
		if (str1.contains(str2)) {
			return 1 + subsrting_rec(str1.replaceFirst(str2, ""), str2);
		}
		return 0;
	}

}
