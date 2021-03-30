package ab.techstack.coding.problems.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * * Input: strs = ["flow","flower","fl","flight"]
 *  * Output: "fl"
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length ==0) return "";
        String longestCommonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(longestCommonPrefix) != 0) {
                longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
                if (longestCommonPrefix.isEmpty()) return "";
            }
        }
        return longestCommonPrefix;
    }
}
