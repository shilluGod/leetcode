package jianzhiOffer.Math;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/16 15:25
 */
public class ReverseLeftWords {

    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        for (int i = n; i < n + s.length(); i++) {
            res.append(s.charAt(i % s.length()));
        }

        return res.toString();
    }


    public static void main(String[] args) {
        ReverseLeftWords reverseLeftWords = new ReverseLeftWords();
        System.out.println(reverseLeftWords.reverseLeftWords("qwerty", 2));
    }

}
