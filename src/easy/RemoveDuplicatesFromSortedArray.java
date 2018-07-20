package easy;

import java.util.Arrays;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * Created by kaming on 2018/7/20.
 */
public class RemoveDuplicatesFromSortedArray {


    /**
     * Example 1:
     * <p>
     * Given nums = [1,1,2],
     * <p>
     * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
     * <p>
     * It doesn't matter what you leave beyond the returned length.
     * Example 2:
     * <p>
     * Given nums = [0,0,1,1,1,2,2,3,3,4],
     * <p>
     * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
     * <p>
     * It doesn't matter what values are set beyond the returned length.
     */
    public static void main(String[] args) {
        int[] expArr1 = new int[]{1, 1, 2};
        int exp1 = removeDuplicates(expArr1);
        System.out.println(exp1 + " " + Arrays.toString(expArr1));
        int[] expArr2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int exp2 = removeDuplicates(expArr2);
        System.out.println(exp2 + " " + Arrays.toString(expArr2));
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


}
