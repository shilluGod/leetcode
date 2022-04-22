package jianzhiOffer.Tree;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/20 15:51
 * @description
 */
public class LowestCommonAncestorII {

    public static void main(String[] args) {
        Integer[] arr = {3,5,1,6,2,0,8,null,null,7,4};
        Integer[] p1 = {5};
        Integer[] q1 = {2};
        TreeNode root = TreeNodeUtil.arrayToTreeNode(arr);
        TreeNode p = TreeNodeUtil.arrayToTreeNode(p1);
        TreeNode q = TreeNodeUtil.arrayToTreeNode(q1);
        LowestCommonAncestorII lowestCommonAncestorII = new LowestCommonAncestorII();
        lowestCommonAncestorII.lowestCommonAncestor(root, p, q);
    }


    private TreeNode ans;

    public LowestCommonAncestorII() {
        this.ans = null;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.dfs(root, p, q);
        return this.ans;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return false;

        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);
        if ((left && right) || ((root.val == p.val || root.val == q.val) && (left || right))){
            ans = root;
        }

        return left || right || (root.val == p.val || root.val == q.val);
    }
}
