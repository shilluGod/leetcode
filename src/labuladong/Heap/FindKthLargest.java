package labuladong.Heap;

import java.util.PriorityQueue;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/5/3 17:00
 * @description 215. 数组中的第K个最大元素
 * https://leetcode-cn.com/problems/kth-largest-element-in-an-array/
 */
public class FindKthLargest {

    /**
     *
     * labuladong
     *
     * mind 二叉树 小根堆
     * 这里用了java的小根堆api, 如果想手撸还是很麻烦的
     * 而且吧，可以用基于快排的方法做，我总觉得剑指有这题，果然忘了
     *
     * time complexity:  O(nlogk)
     * Space Complexity: O(n)
     *
     */
    public int findKthLargest(int[] nums, int k) {
        // 小根堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            priorityQueue.offer(num);

            if (priorityQueue.size() > k)
                priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}
