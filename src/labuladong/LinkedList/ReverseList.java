package labuladong.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/3 11:05
 * @description 206. 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseList {

    /**
     * shillu ok!
     *
     *
     * time complexity:  O(n)
     * Space Complexity: O(1)
     *
     * mind 迭代
     */
/*    public ListNode reverseList(ListNode head) {

        ListNode prev = null, curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }*/

    /**
     * shillu ok!
     *
     *
     * time complexity:  O(n)
     * Space Complexity: O(n)
     *
     * mind 递归 主要还是问递归，毕竟递归复杂很多
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next ==null)
            return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
