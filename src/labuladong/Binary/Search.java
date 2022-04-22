package labuladong.Binary;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/22 17:53
 * @description 704. 二分查找
 * https://leetcode-cn.com/problems/binary-search/
 */
public class Search {

    /**
     * shullu ok!
     * time complexity:  O(logn)
     * Space Complexity: O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > target)
                right = mid - 1;
            else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] == target)
                return mid;
        }

        return -1;
    }
}
