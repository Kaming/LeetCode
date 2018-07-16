package easy;


/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * 罗马数字包含以下七种字符：I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * <p>
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 * <p>
 * Created by kaming on 2018/7/16.
 */
public class RomanToInt {

    /**
     * Example 1:
     * <p>
     * Input: "III"
     * Output: 3
     * Example 2:
     * <p>
     * Input: "IV"
     * Output: 4
     * Example 3:
     * <p>
     * Input: "IX"
     * Output: 9
     * Example 4:
     * <p>
     * Input: "LVIII"
     * Output: 58
     * Explanation: C = 100, L = 50, XXX = 30 and III = 3.
     * Example 5:
     * <p>
     * Input: "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */
    public static void main(String[] args) {
        int exp1 = romanToInt("III");
        System.out.println(exp1);
        int exp2 = romanToInt("IV");
        System.out.println(exp2);
        int exp3 = romanToInt("IX");
        System.out.println(exp3);
        int exp4 = romanToInt("LVIII");
        System.out.println(exp4);
        int exp5 = romanToInt("MCMXCIV");
        System.out.println(exp5);
    }

    private static int romanToInt(String s) {
        if (s.length() <= 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int res = romanCharToInt(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            int prev = romanCharToInt(chars[i - 1]);
            int curr = romanCharToInt(chars[i]);
            if (prev < curr) {
                res = res - prev + (curr - prev);
            } else {
                res += curr;
            }
        }
        return res;
    }

    private static int romanCharToInt(char ch) {
        int d = 0;
        switch (ch) {
            case 'I':
                d = 1;
                break;
            case 'V':
                d = 5;
                break;
            case 'X':
                d = 10;
                break;
            case 'L':
                d = 50;
                break;
            case 'C':
                d = 100;
                break;
            case 'D':
                d = 500;
                break;
            case 'M':
                d = 1000;
                break;
            default:
                break;
        }
        return d;
    }

}
