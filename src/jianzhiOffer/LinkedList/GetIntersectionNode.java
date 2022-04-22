package jianzhiOffer.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/11 13:38
 */
public class GetIntersectionNode {
/*    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // 哈希集合存非基础类型，是存的地址值，val相同的元素，地址值也是不同的。
        // 所以val重复的元素，也是能够区分的，因为用地址值区分它们
        Set<ListNode> visited = new HashSet<>();
        // 把A全部存进set里面
        ListNode temp = headA;
        while (temp != null){
            visited.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while (temp != null){
            if (visited.contains(temp))
                return temp;

            temp = temp.next;
        }

        return null;
    }*/

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode hA = headA, hB = headB;
        while (hA != hB){
            hA = hA == null ? headB : hA.next;
            hB = hB == null ? headA : hB.next;
        }

        return hA;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
