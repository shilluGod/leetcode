package jianzhiOfferII.LinkedList;

import java.util.Stack;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/13 20:08
 *
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        ListNode flag = new ListNode(0);
        temp = flag;
        while (!stack.isEmpty()) {
            temp = temp.next = stack.pop();
        }
        temp.next = null;
        return flag.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}


