package labuladong.Stack;

import java.util.Stack;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/5/3 16:18
 * @description 921. 使括号有效的最少添加
 * https://leetcode-cn.com/problems/minimum-add-to-make-parentheses-valid/
 */
public class MinAddToMakeValid {

    /**
     * labuladong
     *
     * mind 没看懂题目，这么简单???
     *
     * time complexity:  O(n)
     * Space Complexity: O(1)
     *
     *
     */
    public int minAddToMakeValid(String s) {

        int res = 0;    // 记录插入次数
        int need = 0;   // 记录右括号需求量

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                need++;
            if (s.charAt(i) == ')') {
                need--;
                if (need == -1){
                    need = 0;
                    res++;
                }
            }
        }
        return res + need;
    }
}
