package jianzhiOfferII.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/20 14:21
 * @description
 */
public class LevelOrderII {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rets = new ArrayList<>();

        if (root == null)
            return rets;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> ret = new ArrayList<>();
            while (size > 0){
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                ret.add(node.val);
                size--;
            }
            rets.add(ret);
        }
        return rets;
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
