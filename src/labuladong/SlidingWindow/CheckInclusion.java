package labuladong.SlidingWindow;

import java.util.Arrays;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/23 16:47
 * @description 567. 字符串的排列
 * https://leetcode-cn.com/problems/permutation-in-string/
 */
public class CheckInclusion {


    /**
     *
     * shillu ok!
     *
     * time complexity:  O(m + n + z)
     * Space Complexity: O(z)    z = 26
     *
     * mind 滑动窗口
     * 考虑到438题，我觉得一模一样呀，我也使用了一模一样的思想来解决
     */
    public boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length(), s2Len = s2.length();

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        if (s1Len > s2Len)
            return false;

        for (int i = 0; i < s1Len; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(s1Count, s2Count))
            return true;

        for (int i = 0; i < s2Len - s1Len; i++) {
            s2Count[s2.charAt(i) - 'a']--;
            s2Count[s2.charAt(i + s1Len) - 'a']++;

            if (Arrays.equals(s1Count, s2Count))
                return true;
        }

        return false;
    }
}
