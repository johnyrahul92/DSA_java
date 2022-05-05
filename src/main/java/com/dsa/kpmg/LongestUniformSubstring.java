package com.dsa.kpmg;

import java.util.HashMap;
import java.util.Map;
//this is wrong
public class LongestUniformSubstring {

	public static void main(String[] args) {
		String input = "abcddcdss";
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();

		char curChar = input.charAt(0);
		int maxx = -1;
		char maxChar = curChar;

		for (int i = 1; i < input.length(); i++) {

			char nextChar = input.charAt(i);
			if (curChar == nextChar) {

				int count = 1;
				if (charCount.get(curChar) != null) {

					count = (int) charCount.get(curChar);
				}

				count = count + 1;
				charCount.put(curChar, count);

				if (count > maxx) {

					maxx = count;
					maxChar = curChar;
				}
			} else {

				curChar = nextChar;

			}

		} // end for

		if (maxx == -1) {
			System.out.println("no longest uniform sub- string");
		} else {
			System.out.println(maxChar + " occurs " + maxx + " times");
		}
	}

}
