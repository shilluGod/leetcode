package jianzhiOfferII.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/8 20:50
 */
public class DeleteNode {

    public ListNode deleteNode(ListNode head, int val) {

        if(head.val == val)
            return head.next;
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val){
            pre = pre.next;
            cur = pre.next;
        }
        pre.next = cur.next;
        return head;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
