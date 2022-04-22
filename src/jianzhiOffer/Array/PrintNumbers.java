package jianzhiOffer.Array;

import java.util.Arrays;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/5 11:14
 */
public class PrintNumbers {

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        System.out.println(Arrays.toString(printNumbers.printNumbers(10)));
    }

    public int[] printNumbers(int n) {

        double length = Math.pow(10,n) - 1;
        int[] printNumbers = new int[(int) length];
        for (int i = 1; i <= printNumbers.length; i++) {
            printNumbers[i-1] = i;
        }
        return printNumbers;
    }
}
