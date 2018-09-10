package easy;

import java.util.Arrays;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * Created by kaming on 2018/9/10.
 */
public class PlusOne {

    /**
     * Example 1:
     * <p>
     * Input: [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Example 2:
     * <p>
     * Input: [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     */
    public static void main(String[] args) {
        int[] exp1 = plusOne(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(exp1));
        int[] exp2 = plusOne(new int[]{4, 3, 2, 1});
        System.out.println(Arrays.toString(exp2));
    }

    private static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i > -1; i--) {
            if (digits[i] == 9 ) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] newArray = new int[len + 1];
        newArray[0] = 1;
        return newArray;
    }

}
