package labuladong.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/3 10:14
 * @description 876. 链表的中间结点
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class MiddleNode {


    /**
     * shillu ok!
     *
     * time complexity:  O(n)
     * Space Complexity: O(1)
     *
     * mind 快慢指针
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
