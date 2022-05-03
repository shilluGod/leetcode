package labuladong.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/2 23:22
 * @description 142. 环形链表 II
 * https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class DetectCycle {


    /**
     * shillu ok!
     * <p>
     * time complexity:  O(n)
     * Space Complexity: O(1)
     * <p>
     * mind 双指针
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
