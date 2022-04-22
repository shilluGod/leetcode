package ProgrammingAbilityTraining;

import java.util.Arrays;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/21 17:17
 *
 * 给你一个数字数组 arr 。
 *
 * 如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
 *
 * 如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
 *
 */
public class CanMakeArithmeticProgression {

    public static void main(String[] args) {
        CanMakeArithmeticProgression canMake = new CanMakeArithmeticProgression();
        canMake.canMakeArithmeticProgression(new int[]{3,5,1});
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int flag = arr[1] - arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[0] + (flag * i) != arr[i])
                return false;
        }
        return true;
    }
}
