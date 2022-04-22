package ProgrammingAbilityTraining;

import java.util.Arrays;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/22 22:41
 */
public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{4,1,2,1,2}));
    }
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0;i < nums.length - 1; i = i + 2){
            if (nums[i] != nums[i+1])
                return nums[i];
        }
        return nums[nums.length-1];
    }
}
