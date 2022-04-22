package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/22 23:10
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int costLen = cost.length;
        int[] minCosts = new int[costLen + 1];
        minCosts[0] = minCosts[1] = 0;
        for (int i = 2; i <= costLen; i++) {
            minCosts[i] = Math.min(minCosts[i - 1] + cost[i - 1], minCosts[i - 2] + cost[i - 2]);
        }

        return minCosts[costLen];
    }
}
