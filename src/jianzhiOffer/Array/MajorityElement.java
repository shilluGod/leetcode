package jianzhiOffer.Array;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/2/23 12:27
 */
public class MajorityElement {


    // 投票
    public int majorityElement(int[] nums) {
        int candidate =nums[0];
        int count = 0;
        for (int num : nums) {
            if (count == 0)
                candidate = num;
            if (num == candidate){
                count++;
            } else
                count--;
        }
        return candidate;
    }

    // 排序
/*    public int majorElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }*/


    // 哈希
/*    public int majorityElement(int[] nums) {
        Map<Integer,Integer> counts = countNums(nums);
        Map.Entry<Integer,Integer> majorityEntry = null;
        for (Map.Entry<Integer,Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue())
                majorityEntry = entry;
        }

        return majorityEntry.getKey();
    }

    private Map<Integer,Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if(!counts.containsKey(num))
                counts.put(num, 1);
            else
                counts.put(num, counts.get(num) + 1);

        }
        return counts;
    }*/
}
