package jianzhiOffer.Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/17 19:50
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s){
        int left = 0, lenOfLong = 0;    // 设置左边界和最大值
        char[] c = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int ch = map.getOrDefault(s.charAt(i), -1);
            map.put(s.charAt(i), i);
            left = left < i - ch ? left + 1 : i - ch;
            lenOfLong = Math.max(left, lenOfLong);
        }
        return lenOfLong;
    }
}
