package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/21 16:30
 * @description
 */
public class FindNthDigit {

    public int findNthDigit(int n) {

        int digit = 1;
        long start = 1, count = 9;

        while (n > count) {
            n -= count;     // += 不会改变变量本身的数据类型
            digit += 1;
            start *= 10;
            count = digit * start * 9;
        }

        long num = start + (n - 1) / digit;
        return Long.toString(num).charAt((n -1) % digit) - '0';
    }
}
