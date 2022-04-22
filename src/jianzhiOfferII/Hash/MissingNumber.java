package jianzhiOfferII.Hash;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/23 12:48
 */
public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.missingNumber(new int[]{0, 1, 2, 4}));
    }

/*    public int jianzhiOffer.Array.MissingNumber(int[] nums) {

        HashSet<Integer> number = new HashSet<>();
        for (int num:nums) {
            number.add(num);
        }

        int missing = -1;
        for (int i = 0; i <= nums.length; i++) {
            if (!number.contains(i)){
                missing = i;
                break;
            }
        }
        return missing;
    }*/

/*    public int jianzhiOffer.Array.MissingNumber(int[] nums) {
        return (nums.length) * (nums.length + 1) / 2 - Arrays.stream(nums).sum();
    }*/


    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            xor ^= nums[i];
        }
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }
        return xor;
    }
}
