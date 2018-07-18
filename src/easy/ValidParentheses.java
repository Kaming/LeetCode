package easy;

import java.util.Arrays;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * Created by kaming on 2018/7/18.
 */
public class ValidParentheses {

    /**
     * Example 1:
     * <p>
     * Input: "()"
     * Output: true
     * Example 2:
     * <p>
     * Input: "()[]{}"
     * Output: true
     * Example 3:
     * <p>
     * Input: "(]"
     * Output: false
     * Example 4:
     * <p>
     * Input: "([)]"
     * Output: false
     * Example 5:
     * <p>
     * Input: "{[]}"
     * Output: true
     */
    public static void main(String[] args) {
        boolean exp1 = isValid("()");
        System.out.println(exp1);
        boolean exp2 = isValid("()[]{}");
        System.out.println(exp2);
        boolean exp3 = isValid("(]");
        System.out.println(exp3);
        boolean exp4 = isValid("([)]");
        System.out.println(exp4);
        boolean exp5 = isValid("{[]}");
        System.out.println(exp5);

    }

    private static boolean isValid(String s) {
        char[] bChar = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : bChar) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.empty()) return false;
                char ct = stack.peek();
                if ((ct == '{' && c == '}') || (ct == '[' && c == ']')
                        || (ct == '(' && c == ')')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.empty();
    }

}
