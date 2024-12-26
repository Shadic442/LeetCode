package test;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] case1 = { "flower", "flow", "flight" };
		// String[] case2 = {"dog","racecar","car"};

		/*
		 * for (int i = 0; i < strs.length; i++) { System.out.println(strs[i].charAt(i)
		 * == strs[i+1].charAt(i)); }
		 */

		System.out.println(longestCommonPrefix(case1));
		//System.out.println(case1.length);
	}

	static public String longestCommonPrefix(String[] strs) {
		String commonPrefix = "";

		for (int i = 0; i < strs.length - 1 ; i++) {
			//if (i + 1 <= strs.length - 1) {
				if (strs[i].charAt(i) == strs[i + 1].charAt(i)) {
					commonPrefix += strs[i].charAt(i);
				}
			//}
		}
		return commonPrefix;
	}

}
