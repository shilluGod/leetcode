package labuladong.PrefixSum;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/5/3 14:46
 * @description 304. 二维区域和检索 - 矩阵不可变
 * https://leetcode-cn.com/problems/range-sum-query-2d-immutable/
 */
public class NumMatrix {


    /**
     * shillu
     *
     * time complexity:  O(mn)
     * Space Complexity: O(mn)
     *
     * mind 二维前缀和
     * 唯一让我觉得巧妙的地方还是那个利用 数组默认值为 0
     */
    // 设置一个二维数组
    int [][] sums;
    public NumMatrix(int[][] matrix) {

        int m = matrix.length;
        if(m > 0) {
            int n = matrix[0].length;
            sums = new int[m + 1][n + 1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    sums[i + 1][j + 1] = sums[i][j + 1] + sums[i + 1][j] - sums[i][j] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sums[row2 + 1][col2 + 1] - sums[row1][col2 + 1] - sums[row2 + 1][col1] + sums[row1][col1];
    }
}
