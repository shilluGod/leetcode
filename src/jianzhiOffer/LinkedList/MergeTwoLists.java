package jianzhiOffer.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/9 21:02
 */
public class MergeTwoLists {


    // 递归
/*    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        else if (l2 == null)
            return l1;
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }*/

    // 迭代
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 需要一个哨兵指针
        ListNode prev1 = new ListNode(-1);
        ListNode prev = prev1;

        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }

            prev = prev.next;
        }

        if (l1 != null)
            prev.next = l1;
        if (l2 != null)
            prev.next = l2;


        return prev1.next;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
