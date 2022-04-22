package labuladong.Binary;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/22 17:12
 * @description 34. 在排序数组中查找元素的第一个和最后一个位置
 * https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class SearchRange {


    /**
     * tabulatong 二分
     * 这种更好理解
     *
     * time complexity:  O(logn)
     * Space Complexity: O(1)
     */

    public int[] searchRange(int[] nums, int target) {
        return new int[]{left_bound(nums, target), right_bound(nums, target)};
    }

    int left_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        // 搜索区间为 [left, right]
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                // 搜索区间变为 [mid+1, right]
                left = mid + 1;
            } else if (nums[mid] > target) {
                // 搜索区间变为 [left, mid-1]
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 收缩右侧边界
                right = mid - 1;
            }
        }
        // 检查出界情况
        if (left >= nums.length || nums[left] != target) {
            return -1;
        }
        return left;
    }

    int right_bound(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] == target) {
                // 这里改成收缩左侧边界即可
                left = mid + 1;
            }
        }
        // 这里改为检查 right 越界的情况，见下图
        if (right < 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }


    /**
     * 官方解法
     * 二分查找
     */

/*    public int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target)
            return new int[]{leftIdx, rightIdx};

        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] > target || (lower && nums[mid] >= target)){
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }*/


    /**
     * shillu
     */
/*    public int[] searchRange(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left <= right && nums[left] != target && nums[right] != target) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] > target) {
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        if (nums[left] == target){
            for (int i = right; i >= left ; i--) {
                if (nums[i] == target){
                    right = i;
                    continue;
                }
            }
        } else if (nums[right] == target) {
            for (int i = left; i <= right ; i++) {
                if (nums[i] == target){
                    left = i;
                    continue;
                }
            }
        } else if (nums[right] == target && nums[left] == target) {
            return new int[]{left, right};
        } else return new int[]{-1, -1};

        return new int[]{left, right};
    }*/
}
