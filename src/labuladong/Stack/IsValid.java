package labuladong.Stack;

import java.util.Stack;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/5/3 15:52
 * @description 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class IsValid {


    /**
     * shillu
     *
     * mind stack
     *
     * time complexity:  O(n)
     * Space Complexity: O(6)
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else if (!stack.isEmpty() && s.charAt(i) == leftOfRight(stack.peek()))
                stack.pop();
            else if (!stack.isEmpty() && s.charAt(i) != leftOfRight(stack.peek()))
                return false;
        }
        return stack.isEmpty();
    }
    private char leftOfRight(char c) {
        if (c == '(')
            return ')';
        if (c == '{')
            return '}';
        return ']';
    }
}
