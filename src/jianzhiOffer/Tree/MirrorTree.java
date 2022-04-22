package jianzhiOffer.Tree;


/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/19 11:11
 * @description
 */
public class MirrorTree {

    public TreeNode mirrorTree(TreeNode root) {
        if(root == null)
            return null;

        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);

        root.left = right;
        root.right = left;
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
