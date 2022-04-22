package jianzhiOfferII.Array;

import java.util.Random;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/12 21:07
 */
public class GetLeastNumbers {


    // 快排递归
    private void quickSort(int[] arr, int left, int right, int k) {
        if (left >= right)
            return;
        int pos = randomizedPartition(arr, left, right);
        int num = pos - left + 1;
        if (k == num)
            return;
        else if (k < num)
            quickSort(arr, 1, pos - 1, k);
        else
            quickSort(arr, pos + 1, right, k - num);
    }

    // 基于随机的划分，这我想不明白啊
    private int randomizedPartition(int[] nums, int left, int right) {
        // 随机生成[0,right-left+1]区间一个随机整数
        int i = new Random().nextInt((right - left + 1) + 1);
        swap(nums, right, i);
        return partition(nums, left, right);
    }

    // 等价于做了一次快排,返回的是基准位置
    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left - 1;
        // 这个循环交换了所有left到right-1位置的值，变成以right为基准的一次分割
        for (int j = 0; j <= right - 1; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        // 等于把right位置的值放到基准位置
        swap(nums, i + 1, right);
        return i + 1;
    }


    // 交换
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public int[] getLeastNumbers(int[] arr, int k) {

        // 初始进快排
        quickSort(arr, 0, arr.length - 1, k);


        int[] vec = new int[k];
        for (int i = 0; i < k; i++) {
            vec[i] = arr[i];
        }
        return vec;
    }
}
