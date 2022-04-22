package jianzhiOfferII.Hash;

import java.util.Arrays;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/23 14:32
 */
public class Intersection {

/*    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            if (!set1.contains(num))
                set1.add(num);
        }
        for (int num: nums2){
            if (set1.contains(num))
                set2.add(num);
        }
        return set2.stream().mapToInt(i->i).toArray();
    }*/

    // 双指针
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int num1Len = nums1.length,num2Len = nums2.length;
        int num1Index = 0,num2Index = 0, index = 0, preSame = -1;
        int[] intersection = new int[num1Len + num2Len];

        while (num1Index < num1Len && num2Index < num2Len){
            if (nums1[num1Index] == nums2[num2Index] && preSame != nums2[num2Index]){
                intersection[index] = nums1[num1Index];
                preSame = nums2[num2Index];
                num1Index++;
                num2Index++;
                index++;
            }else if (nums1[num1Index] > nums2[num2Index])
                num2Index++;
            else num1Index++;
            
        }
        return Arrays.copyOfRange(intersection,0,index);
    }
}
