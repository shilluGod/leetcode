package labuladong.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/2 19:31
 * @description ListNode类
 */

public class ListNode {
    int val;
    ListNode next;

    ListNode() {

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
