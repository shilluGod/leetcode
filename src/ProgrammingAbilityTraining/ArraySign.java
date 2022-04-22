package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/21 16:09
 *
 * 已知函数 signFunc(x) 将会根据 x 的正负返回特定值：
 *
 * 如果 x 是正数，返回 1 。
 * 如果 x 是负数，返回 -1 。
 * 如果 x 是等于 0 ，返回 0 。
 * 给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。
 *
 * 返回 signFunc(product) 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sign-of-the-product-of-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ArraySign {

    public static void main(String[] args) {
        ArraySign arraySign = new ArraySign();
        // System.out.println(arraySign.arraySign(new int[]{41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41}));
        System.out.println(arraySign.arraySign(new int[]{72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24}));
    }

    public int arraySign(int[] nums) {
        boolean choose = true;
        for (int num : nums) {
            if (num == 0)
                return 0;
            if (num < 0)
                choose = !choose;
        }
        return choose ? 1 :-1;
    }
}
