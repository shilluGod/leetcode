package labuladong.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/2 22:44
 * @description 19. 删除链表的倒数第 N 个结点
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthFromEnd {


    /**
     *
     * shillu ok!
     * time complexity:  O(n)
     * Space Complexity: O(1)
     *
     * mind 双指针
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
