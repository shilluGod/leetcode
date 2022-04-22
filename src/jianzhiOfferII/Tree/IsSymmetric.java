package jianzhiOfferII.Tree;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/19 16:06
 * @description
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
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
