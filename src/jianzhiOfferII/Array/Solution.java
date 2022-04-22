package jianzhiOfferII.Array;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/21 18:09
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    }

    public int removeDuplicates(int[] nums) {
        int flag = -1;
        int arrayFlag = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == arrayFlag){
                flag++;
            }else{
                nums[i - flag] = nums[i];
                arrayFlag = nums[i];
            }
        }

        System.out.println(nums);

        return 0;
    }
}
