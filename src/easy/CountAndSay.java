package easy;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * <p>
 * Note: Each term of the sequence of integers will be represented as a string.
 * <p>
 * 报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 * <p>
 * 注意：整数顺序将表示为一个字符串。
 * <p>
 * Created by Kaming on 2018/7/26.
 */
public class CountAndSay {

    /**
     * Example 1:
     * <p>
     * Input: 1
     * Output: "1"
     * Example 2:
     * <p>
     * Input: 4
     * Output: "1211"
     */
    public static void main(String[] args) {
        String exp1 = countAndSay(1);
        System.out.println(exp1);
        String exp2 = countAndSay(4);
        System.out.println(exp2);
    }

    private static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            String output = countAndSay(n - 1);
            String result = "";
            int index = 0;
            while (index < output.length()) {
                char current = output.charAt(index);
                int cursor = index, count = 0;
                while (cursor < output.length() && output.charAt(cursor) == current) {
                    cursor++;
                    count++;
                }
                char number = (char)(count + '0');
                result += number;
                result += current;
                index += count;
            }
            return result;
        }
    }

}
