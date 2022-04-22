package ProgrammingAbilityTraining;

import java.util.Arrays;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/8 14:50
 */
public class Exchange {



    public int[] exchange(int[] nums) {
        int slow = 0, fast = 0;

        while (fast < nums.length){
            if (nums[fast]%2 == 1)
                swap(nums, slow++, fast);
            fast++;

        }

        return nums;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

/*
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1, temp;
        while (left < right) {
            while (left < right && nums[left] % 2 == 1)
                left++;
            while (left < right && nums[right] % 2 == 0)
                right--;

            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

        return nums;
    }
*/



/*
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] exchangeArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 1){
                exchangeArray[left] = nums[i];
                left++;
            } else {
                exchangeArray[right] = nums[i];
                right--;
            }
        }

        return exchangeArray;
    }
*/

    public static void main(String[] args) {
        Exchange exchange = new Exchange();
        System.out.println(Arrays.toString(exchange.exchange(new int[]{1, 2, 3, 4})));
    }
}
