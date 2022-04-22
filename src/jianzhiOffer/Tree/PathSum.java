package jianzhiOffer.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/22 14:48
 * @description
 */
public class PathSum {

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        recur(root, target);
        return res;
    }

    void recur(TreeNode root, int target) {
        if (root == null)
            return;

        path.add(root.val);
        target -= root.val;

        if (target == 0 && root.left == null && root.right == null)
            res.add(new LinkedList(path));

        recur(root.left, target);
        recur(root.right, target);
        path.removeLast();
    }

}
