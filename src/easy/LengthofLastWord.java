package easy;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * <p>
 * Created by kaming on 2018/9/10.
 */
public class LengthofLastWord {

    /**
     * Example:
     *
     * Input: "Hello World"
     * Output: 5
     */
    public static void main(String[] args){
        int exp1 = lengthOfLastWord(" ");
        System.out.println(exp1);
    }

    private static int lengthOfLastWord(String s) {
        int wordLength;
        if (s == null || s.length() == 0){
            wordLength = 0;
        }else{
            String[] wordArr = s.split(" ");
            if (wordArr.length == 0 ){
                wordLength = 0;
            }else{
                String word = wordArr[wordArr.length - 1];
                wordLength = word.length();
            }
        }
        return wordLength;
    }


}
