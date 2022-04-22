package labuladong.Binary;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/22 17:59
 * @description 35. 搜索插入位置
 * https://leetcode-cn.com/problems/search-insert-position/
 */
public class SearchInsert {


    /**
     * shillu ok!
     * time complexity:  O(logn)
     * Space Complexity: O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {

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

        return left;
    }
}
