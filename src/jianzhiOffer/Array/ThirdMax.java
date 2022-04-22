package jianzhiOffer.Array;

import java.util.Arrays;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/23 12:29
 */
public class ThirdMax {

    public static void main(String[] args) {
        ThirdMax thirdMax = new ThirdMax();
        System.out.println(thirdMax.thirdMax(new int[]{2, 2, 3, 1}));
    }

    public int thirdMax(int[] nums) {
        int flag = 1;
        if (nums.length >= 3) {
            Arrays.sort(nums);
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] != nums[i + 1])
                    flag++;
                if (flag == 3) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }
}
