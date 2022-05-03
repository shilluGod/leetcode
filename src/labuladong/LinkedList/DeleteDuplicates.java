package labuladong.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/3 10:31
 * @description 83. 删除排序链表中的重复元素
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class DeleteDuplicates {

    /**
     * shillu ok!
     *
     * time complexity:  O(n)
     * Space Complexity: O(1)
     *
     * mind 双指针
     *
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode slow = head, fast = head;

        if (head == null)
            return null;
        while (fast != null){
            if (slow.val != fast.val){
                slow.next = fast;
                slow = slow.next;
            }

            fast = fast.next;
        }

        slow.next = null;
        return head;
    }
}
