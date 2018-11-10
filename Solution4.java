package leetcode;

public class Solution4 {
    public int removeElement(int[] nums, int val) {
        int begin = 0;
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            if (nums[0] == val) {
                return 0;
            } else {
                return 1;
            }
        }
        int end = nums.length - 1;
        while (begin < end) {
            //找到目前第一个值为val的元素
            while (nums[begin] != val && begin < end) {
                begin++;
            }
            //从后面找到第一个值不为val的元素
            while (nums[end] == val && begin < end) {
                end--;
            }

            if (begin != end) {
                int tmp = nums[begin];
                nums[begin] = nums[end];
                nums[end] = tmp;

            } else {
                if (nums[begin] != nums[end]){
                    return end + 1;
                }else{
                    if(nums[end] == val){
                        return end;
                    }
                    return end + 1;
                }

            }

        }

        return end;
    }

    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(new Solution4().removeElement(nums,3));
    }
}
