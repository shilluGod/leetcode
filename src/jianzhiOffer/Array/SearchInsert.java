package jianzhiOffer.Array;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/23 20:11
 */
public class SearchInsert {



    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        System.out.println(searchInsert.searchInsert(new int[]{1,3,5},3));
    }

    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] > target)
                high = mid - 1;
            else low = mid + 1;

        }
        return low;
    }
}
