package easy;

import java.util.Arrays;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素
 * <p>
 * Created by Kaming on 2018/7/23.
 */
public class RemoveElement {

    /**
     * Example 1:
     * <p>
     * Given nums = [3,2,2,3], val = 3,
     * <p>
     * Your function should return length = 2, with the first two elements of nums being 2.
     * <p>
     * It doesn't matter what you leave beyond the returned length.
     * Example 2:
     * <p>
     * Given nums = [0,1,2,2,3,0,4,2], val = 2,
     * <p>
     * Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
     * <p>
     * Note that the order of those five elements can be arbitrary.
     * <p>
     * It doesn't matter what values are set beyond the returned length.
     */
    public static void main(String[] args) {
        int[] expArr1 = new int[]{3, 2, 2, 3};
        int exp1 = removeElement(expArr1, 3);
        System.out.println(exp1 + " " + Arrays.toString(expArr1));
        int[] expArr2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int exp2 = removeElement(expArr2, 2);
        System.out.println(exp2 + " " + Arrays.toString(expArr2));
    }

    private static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


}
