package jianzhiOfferII.Stack;

import java.util.Stack;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/21 16:59
 * @description
 */
public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stack.push(num);
            while (!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }

        return stack.isEmpty();
    }
}
