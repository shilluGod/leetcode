package labuladong.LinkedList;

import java.util.List;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/3 11:57
 * @description 234. 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class IsPalindrome {


    /**
     * shillu ok!
     *
     * time complexity:  O(n)
     * Space Complexity: O(1)
     *
     * mind 双指针 + 反转链表
     * 这一题递归我是实实在在是看不明白了，有时间再看吧
     */
    public boolean isPalindrome(ListNode head) {

        // 先寻找中间位置
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // 奇书链表前进一步
        if (fast != null){
            slow = slow.next;
        }

        ListNode p1 = head;
        ListNode p2 = reverse(slow);
        while (p2 != null){
            if (p1.val != p2.val)
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    // 反转链表
    private ListNode reverse(ListNode head){
        ListNode prev = null, curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
