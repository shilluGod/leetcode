package jianzhiOffer.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/7 21:08
 */
public class PostorderTraversal {

    // 迭代
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> tree = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode prev = null;

        while (!stack.isEmpty() || root!=null){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if (root.right == null || root.right == prev){
                tree.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }

        return tree;
    }



/*
    // 递归
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        postorder(root, tree);
        return tree;
    }

    public void postorder(TreeNode root, List<Integer> tree){
        if (root == null)
            return;

        postorder(root.left, tree);
        postorder(root.right, tree);
        tree.add(root.val);
    }
*/




      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
     }
}
