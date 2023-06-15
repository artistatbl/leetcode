public class TwoSum {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		// First we create an array of number
		// {0, 1, 2, 3}

		int target = 17;
		// Than we give the target number that we want, for example
		// let's add 2 + 15 has the target of the twosum,
		// we got five number in the array and since the we start counting from 0,
		// meaning that the answer should 0, 3 because the two numbers we are adding
		// together.

		int[] result = twoSum(nums, target);
		System.out.println("Indices:" + result[0] + ", " + result[1]);
		//System.out.println("Total Sum:" + result[2]);
		// outputIndices: 0, 1

	}

	/**
	 * Finds the indices of two numbers in the given array that add up to the
	 * target.
	 *
	 * @param nums   The array of integers.
	 * @param target The target sum.
	 * @return An array containing the indices of the two numbers.
	 * @throws IllegalArgumentException If no two elements add up to the target.
	 */
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {

					return new int[] { i, j };
				}
			}
		}

		throw new IllegalArgumentException("No two elements add up to the target.");
	}

}
