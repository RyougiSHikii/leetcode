package card.search;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/11 20:19
 */
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int value : nums2) {
            if (set.contains(value)) {
                set2.add(value);
            }
        }

        int[] result = new int[set2.size()];
        Iterator<Integer> iterator = set2.iterator();

        int i = 0;
        while (iterator.hasNext()) {
            result[i++] = iterator.next();
        }
        return result;
    }
}
