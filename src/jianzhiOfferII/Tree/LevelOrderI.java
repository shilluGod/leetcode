package jianzhiOfferII.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/22 10:24
 * @description
 */
public class LevelOrderI {

    public int[] levelOrder(TreeNode root) {
        if (root == null)
            return new int[0];

        // BFS
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> ret = new ArrayList<Integer>();
        queue.offer(root);
        // int size = queue.size();
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if (node.left != null)
                queue.offer(node.left);
            if (node.right != null)
                queue.offer(node.right);

            ret.add(node.val);
        }

        int[] ans = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            ans[i] = ret.get(i);
        }

        return ans;
    }
}
