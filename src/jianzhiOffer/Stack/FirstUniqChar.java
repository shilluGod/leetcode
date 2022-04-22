package jianzhiOffer.Stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/16 15:36
 */
public class FirstUniqChar {

    public char firstUniqChar(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // .getOrDefault() 表示默认不存在时的value的默认值，这里就是ch不存在时，就把value设置为0
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i)) == 1)
                return s.charAt(i);
        }
        return ' ';
    }
}
