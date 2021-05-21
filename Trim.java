//Write functions that will trim a string left and trim a string right.

package com.demo.assignment5;

public class Trim {

	public static void main(String[] args) {
		String abc = "  TietoEvry  ";

		System.out.println("ltrim " + ltrim(abc));
		System.out.println("rtrim " + rtrim(abc));
	}

	public static String rtrim(String s) {
		int i = s.length() - 1;
		while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
			i--;
		}
		return s.substring(0, i + 1);
	}

	public static String ltrim(String s) {
		int i = 0;
		while (i < s.length() && Character.isWhitespace(s.charAt(i))) {

			i++;
		}
		return s.substring(i);
	}

}
