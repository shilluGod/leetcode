package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/12 19:10
 *
 * 给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目。
 */
public class CountOdds {
    public static void main(String[] args) {
        CountOdds countOdds = new CountOdds();
        System.out.println(countOdds.countOdds(4, 4));
    }

    public int countOdds(int low, int high) {
        if ((low + high) % 2 == 0){
            if (low % 2 == 1)
                return (high - low)/2 + 1;
            return (high - low)/2;
        }
        else
            return (high - low + 1)/2;
    }

}
