package ProgrammingAbilityTraining;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/3/1 19:41
 */
public class ArraySort implements Runnable {

    private String num;

    public ArraySort(int num) {
        this.num = num + "";
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 2, 5, 7, 6, 6};
        for (int num : nums) {
            new Thread(new ArraySort(num)).start();
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(Integer.parseInt(num));
            System.out.println(num);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
