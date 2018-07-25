package easy;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * <p>
 * Created by Kaming on 2018/7/25.
 */
public class SearchInsertPosition {

    /**
     * Example 1:
     * <p>
     * Input: [1,3,5,6], 5
     * Output: 2
     * Example 2:
     * <p>
     * Input: [1,3,5,6], 2
     * Output: 1
     * Example 3:
     * <p>
     * Input: [1,3,5,6], 7
     * Output: 4
     * Example 4:
     * <p>
     * Input: [1,3,5,6], 0
     * Output: 0
     */
    public static void main(String[] args) {
        int exp1 = searchInsert(new int[]{1,3,5,6},5);
        System.out.println(exp1);
        int exp2 = searchInsert(new int[]{1,3,5,6},2);
        System.out.println(exp2);
        int exp3 = searchInsert(new int[]{1,3,5,6},7);
        System.out.println(exp3);
        int exp4 = searchInsert(new int[]{1,3,5,6},0);
        System.out.println(exp4);
    }

    private static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int mid;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }


}
