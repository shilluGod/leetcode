package labuladong.Stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/5/3 16:35
 * @description 225. 用队列实现栈
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 */
public class MyStack {


    /**
     * shillu ok!
     *
     * mind 就留两个那个比较有点想法
     *
     * time complexity:  O(n)
     * Space Complexity: O(1)
     */
    Queue<Integer> queue = new LinkedList<>();
    int top = 0;

    public MyStack() {

    }

    public void push(int x) {
        queue.offer(x);
        top = x;
    }

    public int pop() {
        int size = queue.size();
        // 为啥要留两个呢，这是为了记录栈顶元素，不然留一个就行了
        while (size > 2){
            queue.offer(queue.poll());
            size--;
        }
        top = queue.peek();
        queue.offer(queue.poll());
        return queue.poll();
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
