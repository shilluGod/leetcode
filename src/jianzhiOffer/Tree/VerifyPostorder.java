package jianzhiOffer.Tree;

import java.util.Stack;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/22 14:35
 * @description
 */
public class VerifyPostorder {

    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for(int i = postorder.length - 1; i >= 0; i--) {
            if(postorder[i] > root) return false;
            while(!stack.isEmpty() && stack.peek() > postorder[i])
                root = stack.pop();
            stack.add(postorder[i]);
        }
        return true;
    }
}
