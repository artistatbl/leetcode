import java.util.ArrayList;
import java.util.List;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strings = {"car", "cat", "carrots"};
        List<String> results = longestCommonPrefix(strings);
        for (String result : results) {
            System.out.println(result);
        }
        // Output: "fl"
        //         "flow"
        //         "flight"
    }

    public static List<String> longestCommonPrefix(String[] strs) {
        List<String> results = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return results; // If the array is null or empty, return an empty list
        }

        String prefix = strs[0]; // Start with the first string as the prefix

        for (int i = 1; i < strs.length; i++) { // Iterate through the remaining strings
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1); // Remove the last character of the prefix
                if (prefix.isEmpty()) {
                    return results; // If prefix becomes empty, there's no common prefix
                }
            }
        }

        for (String str : strs) {
            if (str.startsWith(prefix)) {
                results.add(str); // Add the word to the results list if it starts with the prefix
            }
        }

        return results;
    }
}
