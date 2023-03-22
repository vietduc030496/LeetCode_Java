package com.vti.leetcode;

/**
 * Given a string s consisting of words and spaces, return the length of the
 * last word in the string. A word is a maximal substring consisting of
 * non-space characters only.
 *
 */
public class Length_of_Last_Word_58 {

	public int lengthOfLastWord(String s) {
		s = s.trim();
		return s.substring(s.lastIndexOf(" ") + 1).length();
	}

}
