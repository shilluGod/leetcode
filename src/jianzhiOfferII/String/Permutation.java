package jianzhiOfferII.String;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/17 15:11
 */
public class Permutation {

    List<String> res = new LinkedList<>();
    char[] c;


    public String[] permutation(String s) {
        c = s.toCharArray();    // 字符串转化为字符数组
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    void dfs(int x) {
        // 全排列存入数组中
        if (x == c.length -1){
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i]))
                continue;

            set.add(c[i]);
            swap(i, x);
            dfs(x + 1);
            swap(i, x);
        }
    }

    void swap(int a, int b){
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
