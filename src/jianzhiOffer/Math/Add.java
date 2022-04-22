package jianzhiOffer.Math;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/11 20:38
 */
public class Add {

    public static void main(String[] args) {
        Add add = new Add();
        add.add(3,5);
    }

    public int add(int a, int b) {
        while (b != 0){
            int c = (a&b) << 1;
            a = a ^ b;
            b = c;
        }
        return a;
    }
}
