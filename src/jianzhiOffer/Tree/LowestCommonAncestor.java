package jianzhiOffer.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/20 14:51
 * @description
 */
public class LowestCommonAncestor {


    // 两次遍历
/*    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> ret1 = getPath(root, p);
        List<TreeNode> ret2 = getPath(root, q);
        TreeNode ans = null;

        for (int i = 0; i < ret1.size() && i < ret2.size(); i++) {
            if (ret1.get(i) == ret2.get(i))
                ans = ret1.get(i);
            else break;
        }
        return ans;
    }

    public List<TreeNode> getPath(TreeNode root, TreeNode target){
        List<TreeNode> path = new ArrayList<>();
        TreeNode node = root;
        while (node != target){
            path.add(node);
            if (target.val > node.val)
                node = node.right;
            else
                node = node.left;
        }
        path.add(node);
        return path;
    }*/

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode node = root;
        while (true) {
            if (node.val > p.val && node.val > q.val)
                node = node.left;
            else if (node.val < p.val && node.val < q.val)
                node = node.right;
            else break;
        }

        return node;
    }


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
