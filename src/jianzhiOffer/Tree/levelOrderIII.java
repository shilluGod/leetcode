package jianzhiOffer.Tree;

import java.util.*;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/22 10:36
 * @description
 */
public class levelOrderIII {
/*    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> rets = new ArrayList<>();
        if (root == null)
            return rets;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            LinkedList<Integer> tem = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (rets.size() % 2 == 0){
                    tem.addLast(node.val);  // 偶数层 -> 队列头部
                } else {
                    tem.addFirst(node.val); // 奇数层 -> 队列尾部
                }
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            rets.add(tem);
        }
        return rets;
    }*/

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> rets = new ArrayList<>();
        if (root == null)
            return rets;

        // Deque双端队列
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);

        while (!deque.isEmpty()){
            // 打印奇数层
            List<Integer> temp = new ArrayList<>();
            for (int i = deque.size(); i > 0; i--) {
                // 从左向右打印
                TreeNode node = deque.removeFirst();
                temp.add(node.val);
                if (node.left != null)
                    deque.addLast(node.left);
                if (node.right != null)
                    deque.addLast(node.right);
            }
            rets.add(temp);

            if (deque.isEmpty())    // 判空提前结束
                break;

            temp = new ArrayList<>();
            // 打印偶数层
            for (int i = deque.size(); i > 0; i--) {
                // 从左向右打印
                TreeNode node = deque.removeLast();
                temp.add(node.val);
                if (node.right != null)
                    deque.addFirst(node.right);
                if (node.left != null)
                    deque.addFirst(node.left);

            }
            rets.add(temp);
        }
        return rets;
    }
}
