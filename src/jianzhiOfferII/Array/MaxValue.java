package jianzhiOfferII.Array;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/13 22:37
 */
public class MaxValue {

    public int maxValue(int[][] grid) {
        // 最大值记录
        int maxValue = Integer.MIN_VALUE;
        int rows = grid.length, columns = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 && j == 0)
                    continue;
                if (i == 0)
                    grid[i][j] += grid[i][j - 1];
                else if (j == 0)
                    grid[i][j] += grid[i - 1][j];
                else grid[i][j] += Math.max(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[rows][columns];
    }
}
