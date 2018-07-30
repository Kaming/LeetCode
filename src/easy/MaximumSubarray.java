package easy;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * Created by Kaming on 2018/7/26.
 */
public class MaximumSubarray {

    /**
     * Example:
     * <p>
     * Input: [-2,1,-3,4,-1,2,1,-5,4],
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     */
    public static void main(String[] args) {
        int exp1 = maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(exp1);
    }

    private static int maxSubArray(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        int max = nums[0];
        int tempMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (tempMax <= 0) {
                tempMax = nums[i];
            } else {
                tempMax += nums[i];
            }
            if (tempMax > max) {
                max = tempMax;
            }
        }
        return max;
    }

}
