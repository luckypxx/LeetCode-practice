package leetcode;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 *
 * 所以返回 [0, 1]*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = 0;
        for(;left<nums.length;++left){
            for(right = left + 1;right <nums.length;++right){
                if((nums[left] + nums[right]) == target)
                    return new int[]{left,right};
            }
        }
        return null;
    }
}