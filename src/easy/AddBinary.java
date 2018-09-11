package easy;

/**
 * Given two binary strings, return their sum (also a binary string).
 * The input strings are both non-empty and contains only characters 1 or 0.
 * <p>
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 * <p>
 * Created by kaming on 2018/9/11.
 */
public class AddBinary {

    /**
     * Example 1:
     * <p>
     * Input: a = "11", b = "1"
     * Output: "100"
     * Example 2:
     * <p>
     * Input: a = "1010", b = "1011"
     * Output: "10101"
     */
    public static void main(String[] args) {
        String exp1 = addBinary("11", "1");
        System.out.println(exp1);
        String exp2 = addBinary("1010", "1011");
        System.out.println(exp2);
    }

    private static String addBinary(String a, String b) {
        String res = "";
        int m = a.length() - 1, n = b.length() - 1, carry = 0;
        while (m >= 0 || n >= 0) {
            int p = m >= 0 ? a.charAt(m--) - '0' : 0;
            int q = n >= 0 ? b.charAt(n--) - '0' : 0;
            int sum = p + q + carry;
            res = String.valueOf(sum % 2) + res;
            carry = sum / 2;
        }
        return carry == 1 ? "1" + res : res;
    }

}
