package jianzhiOfferII.Tree;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/20 17:56
 * @description
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
