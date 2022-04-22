package jianzhiOffer.Array;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/5 9:32
 */
public class MinArray {

    public static void main(String[] args) {
        MinArray minArray = new MinArray();
        System.out.println(minArray.minArray(new int[]{1,1}));
    }

    public int minArray(int[] numbers) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            int index = low + (high - low) / 2;
            if (numbers[index] < numbers[high]) {
                high = index;
            } else if (numbers[index] > numbers[high]){
                low = index + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}
