package jianzhiOfferII.Math;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/20 18:51
 * @description
 */
public class LastRemaining {

    public int lastRemaining(int n, int m) {
        return f(n, m);
    }

    public int f(int n, int m) {
        if (n == 1)
            return 0;

        int x = f(n - 1, m);
        return (m + x) % n;
    }
}
