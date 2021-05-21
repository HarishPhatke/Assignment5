//	Write a function that accepts a string and returns a string in which characters are 
//converted to uppercase. 

package com.demo.assignment5;

import java.io.StringReader;
import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		str = s.nextLine();
		int length = getLengthOfString(str);
		convertIntoUppercase(length, str);
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

	public static void convertIntoUppercase(int length, String str) {
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
			if (charArrayFromString[j] >= 'a' && charArrayFromString[j] <= 'z') {
				charArrayFromString[j] = (char) (charArrayFromString[j] - 32);
			}
		}

		String str2 = new String(charArrayFromString);
		System.out.println(str2);
	}
}
