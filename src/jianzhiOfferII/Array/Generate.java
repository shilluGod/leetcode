package jianzhiOfferII.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/22 20:05
 */
public class Generate {

    public static void main(String[] args) {
        Generate generate = new Generate();
        // System.out.println(generate.generate(20));
        // generate.generate(100);
        System.out.println(generate.getRow(3));
    }

    // 杨辉三角II
    public List<Integer> getRow(int rowIndex) {
        List<Integer> preRow = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                }
                else row.add(preRow.get(j - 1) + preRow.get(j));
            }
            preRow = row;
            row = new ArrayList<>();
        }
        return preRow;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> solution = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    row.add(1);
                else
                    row.add(solution.get(i - 2).get(j - 2) + solution.get(i - 2).get(j - 1));
            }
            solution.add(row);
            System.out.println(row);
        }
        return solution;
    }
}
