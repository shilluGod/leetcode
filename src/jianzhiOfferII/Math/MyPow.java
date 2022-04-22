package jianzhiOfferII.Math;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/21 15:49
 * @description
 */
public class MyPow {

    public double myPow(double x, int n) {

        long N = n;
        return N >= 0 ? quickMul(x, N) : 1 / quickMul(x, -N);
    }


    // 递归
/*    public double quickMul(double x, long N) {
        if (N == 0)
            return 1;
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }*/

    // 迭代
    public double quickMul(double x, long N) {
        double ans = 1;
        double x_contribute = x;
        while (N > 0) {
            if (N % 2 == 1)
                ans = ans * x_contribute;

            x_contribute = x_contribute * x_contribute;
            N = N / 2;
        }

        return ans;
    }
}
