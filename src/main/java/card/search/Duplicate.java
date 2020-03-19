package card.search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/16 21:56
 */
public class Duplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        while (len-- > 0) {
            if (set.contains(nums[len])) {
                return true;
            }
            set.add(nums[len]);
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        int[] nums2 = new int[10000];

        for (int num : nums) {
            if (num >= nums2.length) {
                nums2 = Arrays.copyOf(nums2, (int) (num * 1.25));
            }
            if (nums2[num] > 0) {
                return true;
            }
            nums2[num] = nums2[num] + 1;
        }
        return false;
    }
}
