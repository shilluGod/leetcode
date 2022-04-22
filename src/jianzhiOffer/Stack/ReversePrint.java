package jianzhiOffer.Stack;

import java.util.Stack;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/13 16:28
 *
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class ReversePrint {

    public static void main(String[] args) {
        ReversePrint reversePrint =new ReversePrint();
    }

    Stack<ListNode> stack;
    public ReversePrint(){
        stack = new Stack<>();
    }

    public int[] reversePrint(ListNode head) {
        ListNode temp = head;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }

        int[] array = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++){
            array[i] = stack.pop().val;
        }
        return array;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
