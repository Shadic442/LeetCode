package test;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 7, 11, 15 };
		System.out.println(nums.toString());

		Solution.twoSum(nums, 9);
		System.out.println(Solution.twoSum(nums, 9)[1]);

		System.out.println(new int[] { 8, 6 });
	}

	public static class Solution {
		public static int[] twoSum(int[] nums, int target) {
			int n = nums.length; // length of the array

			// loop to move through the array
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (nums[i] + nums[j] == target) {
						return new int[] { i, j }; // return valid solution
					}
				}
			}
			return null; // no solution found
		}
	}
}
