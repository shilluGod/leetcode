package jianzhiOfferII.LinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/11 19:52
 */
public class CopyRandomList {

    // 存节点
    Map<Node, Node> cachedNode = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null)
            return null;

        if (!cachedNode.containsKey(head)){
            Node headNew = new Node(head.val);
            cachedNode.put(head, headNew);
            headNew.next = copyRandomList(head.next);
            headNew.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
}
