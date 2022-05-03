package labuladong.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/2 19:31
 * @description 2. 两数相加
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {


    /**
     * shillu ok!
     *
     *
     * time complexity:  O(n)
     * Space Complexity: O(n)
     *
     * mind
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode p1 = l1, p2 = l2;
        // 虚拟头节点
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        int carry = 0;  // 进位

        // 开始执行加法，两条链表走完且没有进位时才能结束循环

        while (p1 != null || p2 != null || carry > 0){
            int val = carry;

            if (p1 != null){
                val += p1.val;
                p1 = p1.next;
            }
            if (p2 != null){
                val += p2.val;
                p2 = p2.next;
            }

            carry = val / 10;
            val = val % 10;

            p.next = new ListNode(val);
            p = p.next;
        }
        return dummy.next;
    }
}
