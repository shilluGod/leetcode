package jianzhiOfferII.String;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/17 21:31
 */
public class TranslateNum {
    
    public int translateNum(int num){
        String stc = String.valueOf(num);
        int p = 0, q = 0, sum = 1;
        for (int i = 0; i < stc.length(); i++) {
            p = q;
            q = sum;
            sum = 0;
            sum = sum + q;
            if (i==0)
                continue;
            String pre = stc.substring(i - 1, i + 1);
            if (pre.compareTo("25") <= 0 && pre.compareTo("10") >= 0)
                sum = p + sum;
        }

        return sum;
    }
}
