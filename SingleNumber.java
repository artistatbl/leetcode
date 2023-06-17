public class SingleNumber {
	public static int SingleNums(int[] nums){
		int result  = 0;
		for(int num: nums ){
			result ^= num;
		}
		return result;
	}
	public static void main (String[] args){
		int[] nums= {1,2,2};
		int single = SingleNums(nums);
		System.out.println(single);
	}
	
}

/**
 * TO find the element that appears only once in an array you where other element appears twice, 
 * you can use the betwisse XOR operation. XORing an elements with itself results in 0, so when you XOR all the elements in the array
 * the elements that appear twice wwill cancel other out, and only leaving the elements that appears once.
 * 
 */

 /**
  * @param XOR: defination
  *  the bitwise XOR also knows has (OR)operation is a binary operation taht takes two operands and performs a comparision bit by bit. 
  * it return a new value where each bit is set to 1 if exactly one of the corresponding bits in the operands is 1, and 0 otherwise.
  *
  * in java the where use the symbol (^) called caret symbol. 
  *
  * so in the code above the single in an array, we can use XOR to levarage, and XORing the result itself has (0)
  * by the XORing the elements the array, the elements that appear twice will cancel themselve and leave the single number out.
  * there for printing out the single number in the array out to the console. 
  */


/*
 * Test Git Commit...
 */