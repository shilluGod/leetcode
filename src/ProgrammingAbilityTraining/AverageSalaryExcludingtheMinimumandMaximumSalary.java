package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/12 20:25
 *
 * 给你一个整数数组 salary ，数组里每个数都是 唯一 的，其中 salary[i] 是第 i 个员工的工资。
 *
 * 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static void main(String[] args) {
        AverageSalaryExcludingtheMinimumandMaximumSalary averageSalaryExcludingtheMinimumandMaximumSalary = new AverageSalaryExcludingtheMinimumandMaximumSalary();
        System.out.println(averageSalaryExcludingtheMinimumandMaximumSalary.average(new int[]{4000,3000,1000,2000}));

    }
    public double average(int[] salary) {
        double average = 0;
        int low = salary[0];
        int high = salary[1];
        double maxValue = Integer.MIN_VALUE;
        System.out.println(maxValue);
        for (int salarys : salary) {
            average = average + salarys;
            if (salarys >= high)
                high = salarys;
            if (salarys <= low)
                low = salarys;
        }

        return (average - low - high) / (salary.length - 2);
    }
}
