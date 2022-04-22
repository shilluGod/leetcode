package jianzhiOffer.Array;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/9 11:02
 */
public class Search {
    public int search(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false) - 1;
        if (left <= right && right < nums.length && nums[left] == target && nums[right] == target){
            return right - left + 1;
        }

        return 0;
    }

    public int binarySearch(int[] nums, int target, boolean lower){
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)){
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
