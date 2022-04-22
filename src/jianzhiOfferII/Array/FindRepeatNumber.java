package jianzhiOfferII.Array;

import java.util.HashSet;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/23 19:41
 */
public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums) {
            if (set.contains(num))
                return num;
            set.add(num);
        }

        return 0;
    }
}
