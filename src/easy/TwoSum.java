package easy;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数的数组下标。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * Created by Kaming on 2018/7/12.
 */
public class TwoSum {

    /**
     * Example:
     *
     * Given nums = [2, 7, 11, 15], target = 9
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9
     * return [0, 1]
     */
    public static void main(String[] args){
       int[] sum = twoSum(new int[]{2,7,11,15},9);
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] sum = null;
        for(int i = 0;i < nums.length - 1 ;i++){
            for(int j = i + 1; j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    sum = new int[]{i,j};
                    break;
                }
            }
            if(sum != null){
                break;
            }
        }
        return sum;
    }

}
