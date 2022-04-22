package jianzhiOffer.Math;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/23 21:31
 */
public class NumWays {

    public static void main(String[] args) {
        NumWays numWays = new NumWays();
        System.out.println(numWays.numWays(0));
    }

    public int numWays(int n) {
        int a = 0, b = 1, sum;
        for(int i = 1; i <= n; i++){
            sum = (a + b)%1000000007;   // n+2
            a = b;  // n
            b = sum;    // n+1
        }
        return a;
    }
}
