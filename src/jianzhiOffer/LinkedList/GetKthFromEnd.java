package jianzhiOffer.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/9 20:41
 */
public class GetKthFromEnd {


    // 顺序
/*    public ListNode getKthFromEnd(ListNode head, int k) {
        int count = 0;
        ListNode pre = head;
        while (pre != null){
            pre = pre.next;
            count++;
        }
        for (int i = 0; i < count - k; i++) {
            head = head.next;
        }

        return head;
    }*/


    // 双指针
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head, fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }


        return slow;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
