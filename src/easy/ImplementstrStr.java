package easy;

/**
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Created by kaming on 2018/7/24.
 */
public class ImplementstrStr {

    /**
     * Example 1:
     *
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     * Example 2:
     *
     * Input: haystack = "aaaaa", needle = "bba"
     * Output: -1
     */
    public static void main(String[] args){
        int exp1 = strStr("hello,","ll");
        System.out.println(exp1);
        int exp2 = strStr("aaaaa,","bba");
        System.out.println(exp2);
    }

    private static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return 0;
        }
        int n = haystack.length();
        int m = needle.length();
        if(m == 0){
            return 0;
        }
        if(n == 0){
            return -1;
        }
        if (m > n) {
            return -1;
        }
        for (int i = 0; i <= n - m; i++) {
            boolean successFlag = true;
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    successFlag = false;
                    break;
                }
            }
            if (successFlag){
                return i;
            }
        }
        return -1;
    }

}
