package jianzhiOfferII.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/6 13:55
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        TreeNode predecessor = null;

        while (root != null){
            if (root.left != null){
                // 这一步为了找到当前节点的左节点的最右节点
                predecessor = root.left;
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }

                // 让predecessor的右指针指向root，继续遍历左子树
                if (predecessor.right == null){
                    predecessor.right = root;
                    root = root.left;
                }
                // 说明左子树已经访问完了，我们需要断开链接
                else {
                    tree.add(root.val);
                    predecessor.right = null;
                    root = root.right;
                }
            }
            // 如果没有左子树，则直接访问右孩子
            else {
                tree.add(root.val);
                root = root.right;
            }
        }
        return tree;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
