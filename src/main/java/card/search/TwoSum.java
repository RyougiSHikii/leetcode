package card.search;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 计算两数之和的下标
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 5/6/2020 23:31
 */
public class TwoSum {
    /**
     * 计算两数之和下标
     *
     * @param nums   整数数组
     * @param target 两数之和
     * @return 两数之和下标
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> keyMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            keyMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];

            if (keyMap.containsKey(key) && keyMap.get(key) != i) {
                return new int[]{i, keyMap.get(key)};
            }
        }
        return null;
    }
}
