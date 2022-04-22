package jianzhiOffer.Tree;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/8 9:07
 */
public class BuildTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // null node
        if (preorder == null || preorder.length == 0){
            return null;
        }

        // root node
        TreeNode root = new TreeNode(preorder[0]);
        // struct stack
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        // set index ,use aim to inorder
        int inorderIndex = 0;
        for (int i = 1; i < preorder.length; i++) {
            int preorderVal = preorder[i];
            // get top element of stack, use to compare with  inorderIndex
            TreeNode node = stack.peek();
            // search the right child of current node
            if (node.val != inorder[inorderIndex]){
                node.left = new TreeNode(preorderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]){
                    node = stack.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderVal);
                stack.push(node.right);
            }
        }
        return root;
    }




   /* Map<Integer, Integer> indexMap;


    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // length of tree
        int n = preorder.length;
        // build hash mapping for tree, to position root
        indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(preorder[i], i);
        }

        return myBuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    public TreeNode myBuildTree(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        // ???
        if (preorder_left > preorder_right)
            return null;

        // preorder first element is root
        int preorder_root = preorder_left;
        // search root in inorder
        int inorder_root = indexMap.get(preorder[preorder_root]);

        // build root
        TreeNode root = new TreeNode(preorder[preorder_root]);
        // get num of node in left subtree
        int size_left_subtree = inorder_root - inorder_left;
        // use recursive structure left subtree
        root.left = myBuildTree(preorder, inorder, preorder_left + 1, preorder_left + size_left_subtree, inorder_left, inorder_root - 1);
        // use recursive structure rigth subtree
        root.right = myBuildTree(preorder, inorder, preorder_left + size_left_subtree + 1, preorder_right, inorder_root + 1, inorder_right);
        return root;
    }
*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
