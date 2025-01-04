package test;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] case1 = { "flower", "flow", "flight" };
		String[] case2 = { "dog", "racecar", "car" };

		// Arrays.sort(case2);

		/*
		 * for (int i = 0; i < case1.length - 1; i++) {
		 * System.out.println(case1[i].charAt(i) == case1[i + 1].charAt(i));
		 * Arrays.sort(case2); System.out.println(case2[i].toString()); }
		 */

		System.out.println(longestCommonPrefix(case1));
		System.out.println(longestCommonPrefix(case2));

		// System.out.println(case1.length);
	}

	static public String longestCommonPrefix(String[] strs) {
		/*
		 * sort the array in alphabatical order to only compare the fisrt and last words
		 * in the list since all letters need to bo common in all words
		 */
		Arrays.sort(strs);
		String firstWord = strs[0];
		String lastWord = strs[strs.length - 1];
		
		//take the shortest word lenght for the size of the loop
		int shortestWordLenght = firstWord.length() < lastWord.length() 
				? firstWord.length() 
				: lastWord.length();

		String commonPrefix = "";

		/*
		 * for (int i = 0; i < strs.length - 1 ; i++) { if (strs[i].charAt(i) == strs[i
		 * + 1].charAt(i)) { commonPrefix += strs[i].charAt(i); } }
		 */

		/*
		 * for (int i = 0; i < strs.length - 1; i++) { if (firstWord.charAt(i) ==
		 * lastWord.charAt(i)) { commonPrefix += strs[i].charAt(i); } }
		 */
		
		/*
		 * V3
		 * the loop keeps searching even if the first characters are different
		 */
		
		/*
		 * for (int i = 0; i < shortestWordLenght; i++) { if (firstWord.charAt(i) ==
		 * lastWord.charAt(i)) { commonPrefix += firstWord.charAt(i); } }
		 */
		
		/*
		 * V4
		 * need to verify if the characters are not equals
		 * or else the loop keeps searching
		 */
		for (int i = 0; i < shortestWordLenght; i++) {
			if (firstWord.charAt(i) != lastWord.charAt(i)) {
				return commonPrefix;
			} 
			commonPrefix += firstWord.charAt(i);
		} 
		
		return commonPrefix;
	}

}
