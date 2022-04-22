package jianzhiOffer.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/13 14:51
 */
public class IsStraight {

    public boolean isStraight(int[] nums) {

        int min = 13, max = 0;
        Set<Integer> repeat = new HashSet<>();
        for (int num : nums) {
            if (num == 0)
                continue;
            if (!repeat.contains(num)) {
                repeat.add(num);
                max = Math.max(max, num);
                min = Math.min(min, num);
            } else return false;
        }

        return max - min < 5;
    }
}
