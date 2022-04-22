package jianzhiOffer.Array;

import java.util.Arrays;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/8 15:29
 */
public class SpiralOrder {

/*
    public int[] spiralOrder(int[][] matrix) {
        // null matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];

        // set nature of matrix and visited matrix
        int rows = matrix.length, columns = matrix[0].length;
        boolean[][] visited = new boolean[rows][columns];
        int[] order = new int[rows * columns];
        int row = 0, column = 0;

        // four status, 0,1 show : row = row , column = column + 1
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        // direction indicator
        int directionIndex = 0;

        for (int i = 0; i < order.length; i++) {
            order[i] = matrix[row][column];
            visited[row][column] = true;
            int nextRow = row + directions[directionIndex][0];
            int nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= rows || nextColumn < 0 || nextColumn >= columns || visited[nextRow][nextColumn])
                directionIndex = (directionIndex + 1) % 4;

            row += directions[directionIndex][0];
            column += directions[directionIndex][1];

        }
        return order;
    }
*/


    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];

        int rows = matrix.length, columns = matrix[0].length;
        int index = 0;
        int[] order = new int[rows * columns];
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        while (left <= right && top <= bottom){
            for (int column = left; column <= right; column++){
                order[index++] = matrix[top][column];
            }
            for (int row = top + 1; row <= bottom; row++){
                order[index++] = matrix[row][right];
            }
            if (left < right && top < bottom){
                for (int column = right - 1; column > left; column--)
                    order[index++] = matrix[bottom][column];

                for (int row = bottom; row > top ; row--) {
                    order[index++] = matrix[row][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;
    }


    public static void main(String[] args) {
        SpiralOrder spiralOrder = new SpiralOrder();
        System.out.println(Arrays.toString(spiralOrder.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
    }
}
