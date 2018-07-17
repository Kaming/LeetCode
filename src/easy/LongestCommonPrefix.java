package easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * @author Created by Kaming on 2018/7/17.
 * @version Copyright (c) 2018, 货宝宝网络科技有限公司 All Rights Reserved.
 */
public class LongestCommonPrefix {

    /**
     * Example 1:
     * <p>
     * Input: ["flower","flow","flight"]
     * Output: "fl"
     * <p>
     * Example 2:
     * <p>
     * Input: ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     * <p>
     * Note:
     * <p>
     * All given inputs are in lowercase letters a-z.
     */
    public static void main(String[] args) {
        String exp1 = longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        System.out.println(exp1);
        String exp2 = longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        System.out.println(exp2);
    }

    private static String longestCommonPrefix(String[] strs) {
        String word = "";
        if (strs.length <= 0) {
            return word;
        }
        String firstWord = strs[0];
        for (int i = 1; i <= firstWord.length(); i++) {
            String w = firstWord.substring(0, i);
            boolean match = true;
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() || !w.equals(strs[j].substring(0, i))) {
                    match = false;
                    break;
                }
            }
            if (!match) {
                break;
            }
            word = w;
        }
        return word;
    }

}
