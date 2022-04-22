package jianzhiOffer.Array.Easy;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/22 16:34
 * @description  剑指 Offer II 012. 左右两边子数组的和相等
 */
public class PivotIndex {

    public int pivotIndex(int[] nums) {

        if (nums.length == 0)
            return -1;
        int sum = 0, target = 0;
        // 求和
        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (target == sum - target - nums[i])
                return i;
            else {
                target += nums[i];
            }
        }
        return -1;
    }
}
