//Write a program that inputs a string and counts the number of individual and total 
//vowels present in the string.

package com.demo.assignment5;

import java.io.StringReader;
import java.util.Scanner;

public class CharCountProgram {

	public static void main(String[] args) {
		String strFromUser;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");

		strFromUser = sc.next();

		System.out.println("Number of characters present in entered string:  " + countNumberOfCharacters(strFromUser));

		System.out.println("Number of vowels present in entered string:  " + countNumberOfVowels(strFromUser));
	}

	public static int countNumberOfCharacters(String strFromUser) {
		StringReader reader = new StringReader(strFromUser);
		int k = 0;
		int i = 0;
		// char[] output = new char[strFromUser.length()];
		try {
			while ((k = reader.read()) != -1) {
				// output[i] = ((char) k);
				i++;
			}
		} catch (Exception e) {

		}
		return i;

	}

	public static int countNumberOfVowels(String strFromUser) {
		StringReader reader = new StringReader(strFromUser);
		int k = 0;
		int count = 0;
		try {
			while ((k = reader.read()) != -1) {
				char c = ((char) k);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
						|| c == 'o' || c == 'U') {
					count++;
				}
			}
		} catch (Exception e) {

		}
		return count;

	}

}
