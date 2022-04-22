package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/21 15:41
 * @description
 */
public class SumNums {

    public int sumNums(int n) {
        boolean flag = n > 0 && (n = n + sumNums(n - 1)) > 0;
        return n;
    }
}
