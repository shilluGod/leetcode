package jianzhiOfferII.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/20 17:58
 * @description
 */
public class TreeNodeUtil {
    public static TreeNode arrayToTreeNode(Integer[] array){
        if(array.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isLeft = true;
        for(int i = 1; i < array.length; i++){
            TreeNode node = queue.peek();
            if(isLeft){
                if(array[i] != null){
                    node.left = new TreeNode(array[i]);
                    queue.offer(node.left);
                }
                isLeft = false;
            }else {
                if(array[i] != null){
                    node.right = new TreeNode(array[i]);
                    queue.offer(node.right);
                }
                queue.poll();
                isLeft = true;
            }
        }
        return root;
    }
}