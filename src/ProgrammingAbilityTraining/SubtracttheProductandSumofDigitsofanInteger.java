package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/13 15:46
 *
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 */
public class SubtracttheProductandSumofDigitsofanInteger {

    public static void main(String[] args) {
        SubtracttheProductandSumofDigitsofanInteger subtracttheProductandSumofDigitsofanInteger = new SubtracttheProductandSumofDigitsofanInteger();
        System.out.println(subtracttheProductandSumofDigitsofanInteger.subtractProductAndSum(4421));
    }
    public int subtractProductAndSum(int n) {
        int accumulate = 1;
        int sum = 0;
        while (n != 0){
          accumulate = accumulate * (n % 10);
          sum = sum + (n % 10);
          n = n / 10;
        }
        return accumulate - sum;
    }
}
