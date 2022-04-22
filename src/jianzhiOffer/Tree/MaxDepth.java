package jianzhiOffer.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/19 16:42
 * @description
 */
public class MaxDepth {


    // DFS
/*    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }*/

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        // 为什么拿队列？
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);  //在容量已满的情况下，add() 方法会抛出IllegalStateException异常，offer() 方法只会返回 false 。
        int count = 0;
        while (!queue.isEmpty()){
            int size = queue.size();    // 记录队列长度
            while (size > 0){
                TreeNode node = queue.poll();   // poll()返回队首元素的同时删除队首元素，队列为空时返回NULL
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
                size--;     // 清空当前节点的子节点，因为队列先进后出的特点不会出错
            }
            count++;
        }
        return count;
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
