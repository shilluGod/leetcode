package labuladong.PrefixSum;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/5/3 14:30
 * @description 303. 区域和检索 - 数组不可变
 * https://leetcode-cn.com/problems/range-sum-query-immutable/
 */
public class NumArray {


    /**
     * shillu ok!
     *
     * time complexity:  O(n)
     * Space Complexity: O(n)
     *
     * mind 前缀和
     * 比较精秒的地方在于他增长了数组的长度 +1，数组默认是 0
     */
    // 前缀和数组
    private int[] preSum;

    // 构造前缀和数组
    public NumArray(int[] nums) {
        preSum = new int[nums.length + 1];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }

    // 计算累计和
    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }
}
