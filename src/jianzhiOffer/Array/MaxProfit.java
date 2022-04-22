package jianzhiOffer.Array;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/23 11:30
 */
public class MaxProfit {

    public static void main(String[] args) {
        MaxProfit maxProfit =new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public int maxProfit(int[] prices) {

        int[] profits = new int[prices.length];
        int minPrice = prices[0];
        int maxProfits = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfits = Math.max(maxProfits, price - minPrice);
        }
        return maxProfits;
    }
}
