package labuladong.Binary;

import java.util.Arrays;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/23 10:45
 * @description 392. 判断子序列
 * https://leetcode-cn.com/problems/is-subsequence/
 */
public class IsSubsequence {

    /**
     * shillu ok!
     *
     * time complexity:  O(m + n)
     * Space Complexity: O(1)
     *
     * reason 双指针
     * 两个指针分别指向两个字符串，最后能遍历子字符串就返回true
     */
    public boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
