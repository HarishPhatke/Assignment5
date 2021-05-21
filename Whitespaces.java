//Write a function which accepts a string and returns a string that is derived of 
//all its whitespaces.

package com.demo.assignment5;

import java.io.StringReader;
import java.util.Scanner;

public class Whitespaces {

	public static void main(String[] args) {
		String str;
		int j, count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str = sc.nextLine();

		int length = getLengthOfString(str);

		countOfWhiteSpaces(length, str);

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

	public static void countOfWhiteSpaces(int length, String str) {
		StringReader reader = new StringReader(str);
		char[] charArrayFromString = new char[length];
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

		for (int j = 0; j < length; j++) {
			if (charArrayFromString[j] == ' ') {
				count++;
			}
		}

		System.out.println("Number of spaces present in entered string: " + count);
	}

}
