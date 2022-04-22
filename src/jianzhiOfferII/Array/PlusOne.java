package jianzhiOfferII.Array;


import java.util.Arrays;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/23 10:14
 */
public class PlusOne {

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{9})));

    }

    public int[] plusOne(int[] digits) {
        int digitsLen = digits.length;
        for (int i = digitsLen - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] plusOnes = new int[digitsLen + 1];
        plusOnes[0] = 1;
        Arrays.fill(plusOnes, 1, plusOnes.length - 1, 0);
        return plusOnes;
    }
}
