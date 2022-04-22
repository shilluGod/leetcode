package ProgrammingAbilityTraining;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/19 11:11
 *
 *
 * 给定由一些正数（代表长度）组成的数组 nums ，
 * 返回 由其中三个长度组成的、面积不为零的三角形的最大周长 。
 * 如果不能形成任何面积不为零的三角形，返回 0。
 */
public class LargestPerimeterTriangle {

    public static void main(String[] args) {
        LargestPerimeterTriangle largestPerimeterTriangle = new LargestPerimeterTriangle();
        System.out.println(largestPerimeterTriangle.largestPerimeter(new int[]{3,6,2,3}));

    }

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2 ; i--){
            for (int j = i - 1; j >= 1; j--){
                if (nums[i] >= nums[j] + nums[j-1])
                    break;
                else return nums[i] + nums[j] + nums[j-1];
            }
        }
        return 0;
    }
}
