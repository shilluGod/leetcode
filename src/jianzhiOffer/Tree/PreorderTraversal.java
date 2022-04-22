package jianzhiOffer.Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/6 17:14
 */
public class PreorderTraversal {


    // Morris遍历
    public List<Integer> preorderTraversal(TreeNode root) {




        return null;
    }




/*    // 迭代
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        if (root == null)
            return tree;

        TreeNode node = root;
        while (!stack.isEmpty() || node != null){
            while (node != null){
                tree.add(node.val);
                stack.push(node);
                node = node.left;
            }

            node = stack.pop();
            node = node.right;
            }

        return tree;
    }*/





    // 递归
/*    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        preorder(root, tree);
        return tree;
    }

    public void preorder(TreeNode root, List<Integer> tree) {

        if (root == null)
            return;

        tree.add(root.val);
        preorder(root.left, tree);
        preorder(root.right, tree);
    }*/





    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
