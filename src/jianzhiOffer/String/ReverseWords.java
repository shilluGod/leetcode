package jianzhiOffer.String;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/16 14:41
 */
public class ReverseWords {

    public String reverseWords(String s) {
        s = s.trim();   // 删除收尾空格,题目要求
        int right = s.length() - 1, left = right;   // 设置左右边界指针
        StringBuilder res = new StringBuilder();
        while (left >= 0){
            while (left >= 0 && s.charAt(left) != ' ')
                left--;
            res.append(s.substring(left + 1, right + 1) + " ");
            while (left >= 0 && s.charAt(left) == ' ')
                left--;
            right = left;
        }
        return res.toString().trim();   // 其实顺带删了最后一个空格
    }

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        System.out.println(reverseWords.reverseWords("www def ade"));
    }
}
