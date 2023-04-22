package com.vti.leetcode;

public class IsomorphicStrings_205 {

	public static void main(String[] args) {
		String s = "egg", t = "add";
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {
		char[] sChars = new char[256];
		char[] tChars = new char[256];

		for (int i = 0; i < s.length(); i++) {
			char sa = s.charAt(i);
			char ta = t.charAt(i);
			if (sChars[sa] == 0 && tChars[ta] == 0) {
				sChars[sa] = t.charAt(i);
				tChars[ta] = s.charAt(i);
			} else if (sChars[sa] != ta) {
				return false;
			}
		}
		return true;

	}
}
