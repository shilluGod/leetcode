package labuladong.Binary;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/23 11:14
 * @description 875. 爱吃香蕉的珂珂
 * https://leetcode-cn.com/problems/koko-eating-bananas/
 */
public class MinEatingSpeed {


    /**
     * labuladong
     * <p>
     * time complexity:  O(nlogw)
     * Space Complexity: O(1)
     * <p>
     * reason 二分
     * 可以这么理解，如果我当前值可以意味着后面都可以，转化为二分法求解值边界
     */
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1000000000 + 1;

        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (timeForEat(piles, mid) <= h)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    // 定义吃香蕉的速度
    int timeForEat(int[] piles, int x) {
        int hours = 0;

        for (int i = 0; i < piles.length; i++) {
            hours += (piles[i] / x + (piles[i] % x == 0 ? 0 : 1));
        }
        return hours;
    }


    /**
     * shillu
     *
     * time complexity:  O(n^2)
     * Space Complexity: O(1)
     *
     * mind
     * 暴力,但是过不了啊
     */
    /*public int minEatingSpeed(int[] piles, int h) {
        int ans;
        for (int i = 1; ; i++) {
            long count = 0;
            for (int j = 0;j < piles.length ; j++) {
                count += (piles[j] / i + (piles[j] % i == 0 ? 0 : 1));
            }
            if (count <= h) {
                ans = i;
                break;
            }
        }
        return ans;
    }*/


}
