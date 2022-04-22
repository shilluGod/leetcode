package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/13 9:33
 */
public class Numberof1Bits {
    public static void main(String[] args) {
        Numberof1Bits numberof1Bits = new Numberof1Bits();
        System.out.println(numberof1Bits.hammingWeight(00000000000000000000000000001011));
    }

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }
}
