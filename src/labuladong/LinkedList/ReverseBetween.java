package labuladong.LinkedList;

import java.util.List;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/3 10:46
 * @description 92. 反转链表 II
 * https://leetcode-cn.com/problems/reverse-linked-list-ii/
 */
public class ReverseBetween {

    /**
     * labuladong
     *
     * time complexity:  O()
     * Space Complexity: O()
     *
     * mind 递归  顶级解法，面试也主要考察这一种
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == 1)
            return reverseN(head, right);

        head.next = reverseBetween(head.next, left - 1, right - 1);
        return head;
    }

    ListNode successor = null;
    private ListNode reverseN(ListNode head, int n) {

        if (n == 1){
            successor = head.next;
            return head;
        }

        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
