package labuladong.PrefixSum;

import java.util.HashMap;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/5/3 15:13
 * @description 560. 和为 K 的子数组
 * https://leetcode-cn.com/problems/subarray-sum-equals-k/
 */
public class SubarraySum {

    /**
     * labuladong
     *
     * time complexity:  O(n)
     * Space Complexity: O(n)
     *
     * mind 哈希表 + 前缀和
     * 我想不明白啊,
     * 想明白了，真的好美啊
     */
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        // map: 前缀和 -> 次数
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);   // 这么细节吗

        int res = 0, sum0_i = 0;
        for (int i = 0; i < n; i++) {
            sum0_i += nums[i];
            int sum0_j = sum0_i - k;    // 这是我们想找的前缀和 nums[0..j]
            // 如果前面有这个前缀和，则直接更新答案
            if (preSum.containsKey(sum0_j))
                res += preSum.get(sum0_j);
            // 把前缀和 nums[0..i] 加入并记录出现次数
            preSum.put(sum0_i, preSum.getOrDefault(sum0_i, 0) + 1);
        }

        return res;
    }
}
