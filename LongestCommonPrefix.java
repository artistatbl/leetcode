public class LongestCommonPrefix {
	public static void main (String[] args){
		String[]  strings = {"car", "cat", "carrots"}; 
		//create a string with attribute beginming with "car"
		String result = longestCommonString(strings);
		System.out.println(result); 
		//Output: "car"
	}

	/**
	 * @param strs
	 * @return
	 */
	public static String longestCommonString(String[] strs){
		if (strs== null || strs.length == 0) {
			return ""; //If the array is null or empty, return an empty string 
		}

		String prefix = strs[0]; //Start woith the first strinf as the prefix

		for(int i =1; i < strs.length; i++) { //Iterate throught the remaining Strings
			while (!strs[i].startsWith(prefix)){
				prefix = prefix.substring(0, prefix.length() - 1);//Remove the last character of the prefix
				if (prefix.isEmpty()){
					return "";  //If prefix becomes empty, there's no common prefix
				}
			}

		}
		return prefix;
	}
}

