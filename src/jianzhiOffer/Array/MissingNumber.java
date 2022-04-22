package jianzhiOffer.Array;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/13 10:38
 */
public class MissingNumber {

    // 二分
    public int missingNumber(int[] nums){
        int left = 0, right = nums.length - 1;
        int temp = left + (right - left) / 2;

        while (left <= right){
            if (nums[temp] == temp){
                left = temp + 1;
                temp = left + (right - left) / 2;
            } else
                right = temp - 1;
                temp = left + (right - left) / 2;

        }
        return left;
    }


    // 位运算
/*    public int missingNumber(int[] nums){

        int len = nums.length;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            temp = temp ^ nums[i] ^ i;
        }
        temp = temp ^ len;
        return temp;
    }*/
}
