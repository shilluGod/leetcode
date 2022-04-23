package labuladong.Binary;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/23 11:45
 * @description 1011. 在 D 天内送达包裹的能力
 * https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/
 */
public class ShipWithinDays {


    /**
     * shillu ok!
     * <p>
     * time complexity:  O(nlogs(w))
     * Space Complexity: O(1)
     * <p>
     * mind 二分
     */
    public int shipWithinDays(int[] weights, int days) {

        int left = 1, right = 25000000 + 1;  // 500 : 500 + 1

        while (left < right) {
            int mid = (right - left) / 2 + left;

            if (weight(weights, mid) <= days)
                right = mid;
            else
                left = mid + 1;

        }
        return left;
    }

    // 定义运送货物起送最大重量
    int weight(int[] weight, int x) {

        int day = 0, maxWeight = 0;
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] > x){
                return Integer.MAX_VALUE;
            }
            maxWeight += weight[i];
            if (maxWeight > x) {
                maxWeight = weight[i];
                day++;
            }
        }

        return ++day;
    }

    public static void main(String[] args) {
        ShipWithinDays shipWithinDays = new ShipWithinDays();
        System.out.println(shipWithinDays.shipWithinDays(new int[]{1, 2, 3, 1, 1}, 4));
    }
}
