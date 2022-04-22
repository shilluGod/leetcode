package jianzhiOffer.Array.Easy;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/22 16:21
 * @description 剑指 Offer II 006. 排序数组中两个数字之和
 *
 */
public class TwoSum {

    // 双指针
    public int[] twoSum(int[] numbers, int target) {

        int left = 0, right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] < target)
                left++;
            else if (numbers[left] + numbers[right] > target)
                right--;
            else if (numbers[left] + numbers[right] == target)
                return new int[]{left, right};
        }

        return new int[]{};
    }
}
