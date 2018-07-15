package easy;


/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * <p>
 * Created by kaming on 2018/7/12.
 */
public class ReverseInteger {

    /**
     * Example 1:
     *
     * Input: 123
     * Output: 321
     *
     * Example 2:
     *
     * Input: -123
     * Output: -321
     *
     * Example 3:
     *
     * Input: 120
     * Output: 21
     *
     */
    public static void main(String[] args){
        int exp1 = reverse(123);
        System.out.println(exp1);
        int exp2 = reverse(-123);
        System.out.println(exp2);
        int exp3 = reverse(120);
        System.out.println(exp3);
    }

    private static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            //assume that your function returns 0 when the reversed integer overflows
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

}
