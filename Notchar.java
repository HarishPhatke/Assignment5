//Write a program that inputs a string and prints out all the characters that are not digits and not
//alphabets (except vowels).

package com.demo.assignment5;

import java.io.StringReader;
import java.util.Scanner;

public class Notchar {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");

		str = sc.next();
		int length = getLengthOfString(str);
		claculateSpecialCharacter(length, str);

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

	public static void claculateSpecialCharacter(int length, String str) {
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
			if ((charArrayFromString[j] >= 58 && charArrayFromString[j] <= 64)
					|| (charArrayFromString[j] >= 33 && charArrayFromString[j] <= 38)) {
				System.out.println(charArrayFromString[j]);
			}
		}

	}

}
