package labuladong.LinkedList;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/5/3 9:23
 * @description 160. 相交链表
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */
public class GetIntersectionNode {

    /**
     *
     * shillu
     *
     * time complexity:  O(m + n)
     * Space Complexity: O(1)
     *
     * mind 双指针
     * 重点怎么让两个齐头并进，可以同时遍历后交换遍历，这样就行了
     * 震惊我一万年，我还在考虑null的情况，为什么不考虑两个同时null也是相等的呀
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pA = headA, pB = headB;
        while (pA != pB){
            if (pA == null)
                pA = headB;
            else
                pA = pA.next;

            if (pB == null)
                pB = headA;
            else
                pB = pB.next;
        }
        return pA;
    }
}
