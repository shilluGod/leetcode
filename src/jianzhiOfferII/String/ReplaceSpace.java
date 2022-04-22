package jianzhiOfferII.String;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/5 9:11
 */
public class ReplaceSpace {

    public static void main(String[] args) {
        ReplaceSpace replaceSpace = new ReplaceSpace();
        System.out.println(replaceSpace.replaceSpace("We are happy."));
    }


    public String replaceSpace(String s) {
        int sLength = s.length();
        char[] replaceChar = new char[sLength * 3];
        int index = 0;
        for (int i = 0; i < sLength; i++) {
            char getI = s.charAt(i);
            if (getI == ' '){
                replaceChar[index++] = '%';
                replaceChar[index++] = '2';
                replaceChar[index++] = '0';
            } else replaceChar[index++] = getI;
        }
        return new String(replaceChar, 0,index);
    }
}
