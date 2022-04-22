package jianzhiOfferII.Array;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/13 14:30
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left < right){
            if (nums[left] + nums[right] < target)
                left++;
            else if (nums[left] + nums[right] > target)
                right--;
            else if (nums[left] + nums[right] == target)
                return new int[]{nums[left],nums[right]};
        }

        return null;
    }
}
