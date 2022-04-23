package labuladong.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/23 12:23
 * @description  3. 无重复字符的最长子串
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class LengthOfLongestSubstring {


    /**
     * shillu
     *
     * time complexity:  O(n)
     * Space Complexity: O(n)
     *
     * mind 哈希set + 滑动窗口
     */
    public int lengthOfLongestSubstring(String s) {

        Set<Character> occ = new HashSet<>();
        int n = s.length();
        int rk = -1, ans = 0;   // rk是右指针, -1是因为表示在最左侧还没有开始移动
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                // 左指针向右移动一格，移除第一个字符
                occ.remove(s.charAt(i - 1));
            }

            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))){
                occ.add(s.charAt(rk + 1));
                rk++;
            }
            ans = Math.max(ans, rk - i + 1);
        }

        return ans;
    }
}
