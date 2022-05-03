package labuladong.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/2 23:07
 * @description 141. 环形链表
 * https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class HasCycle {


    /**
     *
     * shillu ok!
     *
     * time complexity:  O(n)
     * Space Complexity: O(1)
     *
     * mind 快慢指针
     */
    public boolean hasCycle(ListNode head) {

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }

        return false;
    }
}
