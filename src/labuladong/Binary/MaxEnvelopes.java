package labuladong.Binary;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/22 18:07
 * @description 354. 俄罗斯套娃信封问题
 * https://leetcode-cn.com/problems/russian-doll-envelopes/
 */
public class MaxEnvelopes {


    /**
     * labuladong
     * time complexity:  O(nlogn)
     * Space Complexity: O(n)
     *
     * reason
     * 对宽度作升序排序，需要相同的按照高度降序排序
     *
     * mind
     * 我觉得作为困难题，先前知识是 300.最长递增子序列 ,所以有时间再看看，
     * 而且这个解法不如官方解法的 `二分 + 动态规划`
     */
    public int maxEnvelopes(int[][] envelopes) {

        int n = envelopes.length;
        Arrays.sort(envelopes, new Comparator<int[]>() {    // 重写比较器,比较器我不是很懂啊
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] == b[0] ? b[1] - a[1] : a[0] - b[0];
            }
        });

        // 对高度数组寻找
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = envelopes[i][1];
        }

        return lengthOfLIS(height);
    }

    // 返回nums中lis的长度
    private int lengthOfLIS(int[] nums) {
        int piles = 0, n = nums.length;
        int[] top = new int[n];
        for (int i = 0; i < n; i++) {
            // 要处理的扑克牌
            int poker = nums[i];
            int left = 0, right = piles;
            // 二分插入位置
            while (left < right){
                int mid = (right - left) / 2 + left;
                if (top[mid] >= poker)
                    right = mid;
                else
                    left = mid + 1;
            }
            if (left == piles)
                piles++;

            top[left] = poker;

        }
        return piles;
    }
}
