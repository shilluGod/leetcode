package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/14 9:32
 */
public class SingleNumbers {

/*    public int[] singleNumbers(int[] nums) {
        int ret = 0;
        // 所有值进行一次异或
        for (int num : nums)
            ret ^= num;

        int div = 1;
        // 这个循环就是为了确定这个1在什么位置
        while ((div & ret) == 0)
            div <<= 1;

        int a = 0, b = 0;
        for (int num : nums) {
            if ((div & num) != 0)
                a ^= num;
            else
                b ^= num;
        }

        return new int[]{a, b};

    }*/

    public int singleNumber(int[] nums) {

        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }

}
