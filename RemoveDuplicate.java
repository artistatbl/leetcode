public class RemoveDuplicate {

	/**
	 * Removes duplicates from the given sorted array and returns the count of unique elements.
	 *
	 * @param nums The sorted integer array.
	 * @return The count of unique elements after removing duplicates.
	 */
	public static int RemoveDuplicates(int[] nums) {
	    if (nums.length == 0) {
		   return 0;
	    }
 
	    int k = 1; // Track the number of unique elements
	    int prev = nums[0]; // Track the previous element
 
	    for (int i = 1; i < nums.length; i++) {
		   if (nums[i] != prev) { // If the current element is different from the previous element
			  nums[k++] = nums[i]; // Move the unique element to the next position
			  prev = nums[i]; // Update the previous element
		   }
	    }
 
	    return k;
	}
 
	public static void main(String[] args) {
	    int[] nums = {1, 1, 2, 2, 3, 4, 5, 5, 6};
	    int k = RemoveDuplicates(nums);
 
	    System.out.println("Unique number count: " + k);
	    System.out.print("Modified array: ");
	    for (int i = 0; i < k; i++) {
		   System.out.print(nums[i]);
	    }
	}
 }
 