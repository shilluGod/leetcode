package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/5 10:54
 */
public class HammingWeight {

    public static void main(String[] args) {
        HammingWeight hammingWeight = new HammingWeight();
        System.out.println(hammingWeight.hammingWeight(32));
    }

    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1<<i)) != 0)
                ret++;
        }
        return ret;
    }
}
