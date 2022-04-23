package labuladong.SlidingWindow;

import java.util.*;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/23 15:50
 * @description 438. 找到字符串中所有字母异位词
 * https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 */
public class FindAnagrams {


    /**
     * shillu
     * time complexity:  O(m + (n -m)Z)
     * Space Complexity: O(z)    z = 26
     * mind 哈希 + 滑动窗口
     * 这一题有一个非常nice的思维，就是可以利用数组把26个字母出现的次数存进去，然后滑动只比较各字母出现次数
     */
    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        // 考虑特殊情况
        if (sLen < pLen)
            return new ArrayList<Integer>();

        List<Integer> ans = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        // 统计了两个字符串里面各种字母的数量，写法真的很牛逼
        for (int i = 0; i < pLen; i++) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        // 如果两者字母都一样，那肯定是异构体
        if (Arrays.equals(sCount, pCount)){
            ans.add(0);
        }

        for (int i = 0; i < sLen - pLen; i++) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pLen) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
