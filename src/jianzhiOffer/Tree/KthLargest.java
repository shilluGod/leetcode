package jianzhiOffer.Tree;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/19 17:14
 * @description
 */
public class KthLargest {

    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    void dfs(TreeNode root){
        if (root == null) return;
        dfs(root.right);

        if (k == 0) return;

        if (--k == 0)   // 这个 --k 真的很美
            res = root.val;
        dfs(root.left);
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
