package jianzhiOffer.String;

/**
 * @author shillu
 * @version 1.0
 * @data 2022/4/21 11:29
 * @description
 */
public class MinNumber {

    // 内置函数
/*    public String minNumber(int[] nums) {

        String[] strs = new String[nums.length];

        // 存入字符串进行初始化
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));  // 原来Arrays.sort()还可以这么用，学到了
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }*/

    // 手写快排
    public String minNumber(int[] nums) {

        String[] strs = new String[nums.length];

        // 存入字符串进行初始化
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        quickSort(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }

    void quickSort(String[] strs, int left, int right) {
        if (left >= right)
            return;

        int i = left, j = right;
        String tem = strs[i];
        while (i < j){
            // 其实就是快排的比较大小
            while ((strs[j] + strs[left]).compareTo(strs[left] + strs[j]) >= 0 && i < j)
                j--;
            while ((strs[i] + strs[left]).compareTo(strs[left] + strs[i]) <= 0 && i < j)
                i++;
            // 交换
            tem = strs[i];
            strs[i] = strs[j];
            strs[j] = tem;
        }
        strs[i] = strs[left];
        strs[left] = tem;
        quickSort(strs, left, i - 1);
        quickSort(strs, i + 1, right);
    }
}
