package jianzhiOffer.Stack;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/21 17:16
 * @description
 */
public class MaxQueue {


    int[] q = new int[20000];
    int begin = 0, end = 0;

    public MaxQueue() {

    }

    public int max_value() {
        int ans = -1;
        for (int i = begin; i != end; i++) {
            ans = Math.max(ans, q[i]);
        }

        return ans;
    }

    public void push_back(int value) {
        q[end++] = value;
    }

    public int pop_front() {
        if (begin == end)
            return -1;

        return q[begin++];
    }

}
