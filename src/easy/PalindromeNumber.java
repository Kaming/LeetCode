package easy;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * Created by kaming on 2018/7/14.
 */
public class PalindromeNumber {

    /**
     * Example 1:
     * Input: 121
     * Output: true
     *
     * Example 2:
     *
     * Input: -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left,
     *
     * Example 3:
     *
     * Input: 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     *
     */
    public static void main(String[] args) {
        boolean exp1 = isPalindrome(121);
        System.out.println(exp1);
        boolean exp2 = isPalindrome(-121);
        System.out.println(exp2);
        boolean exp3 = isPalindrome(10);
        System.out.println(exp3);
    }

    private static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == x || (x == rev / 10);
    }


}
