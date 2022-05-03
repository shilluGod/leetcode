package labuladong.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/2 22:54
 * @description 21. 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */


public class MergeTwoLists {

    /**
     * shillu ok!
     *
     * time complexity:  O(n)
     * Space Complexity: O(1)
     *
     * mind 双指针
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode p1 = list1, p2 = list2, node = dummy;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                node.next = p1;
                p1 = p1.next;
            } else {
                node.next = p2;
                p2 = p2.next;
            }
            node = node.next;
        }

        if (p1 != null)
            node.next = p1;
        if (p2 != null)
            node.next = p2;
        return dummy.next;
    }
}
