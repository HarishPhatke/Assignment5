//Write a program that can tell if an inputted string is a palindrome or not.

package com.demo.assignment5;

import java.io.StringReader;
import java.util.Scanner;

public class Palindromicstring {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.next();
		String temp = str;
		int length = getLengthOfString(str);
		reverseTheString(length, str);
	}

	public static int getLengthOfString(String str) {
		StringReader reader = new StringReader(str);
		int k = 0;
		int i = 0;

		try {
			while ((k = reader.read()) != -1) {

				i++;
			}
		} catch (Exception e) {

		}
		return i;

	}

	public static void reverseTheString(int length, String str) {
		StringReader reader = new StringReader(str);
		char[] charArrayFromString = new char[length];
		char[] reverseArray = new char[length];
		int k = 0;
		int i = 0;
		int count = 0;

		try {
			while ((k = reader.read()) != -1) {
				charArrayFromString[i] = (char) k;
				i++;
			}
		} catch (Exception e) {

		}

		for (int j = length - 1; j >= 0; j--) {
			System.out.println(charArrayFromString[j]);
			reverseArray[j] = charArrayFromString[count];
			count++;
		}
		String s = new String(reverseArray);
		if (s.equals(str)) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not palindrom");
		}

	}

}
