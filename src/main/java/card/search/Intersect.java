package card.search;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/16 22:14
 */
public class Intersect {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 3, 1};
        int[] nums2 = {2, 2, 5, 3, 4, 4, 3, 1};
        intersect(nums1, nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
        for (int num : nums1) {
            priorityQueue1.add(num);
        }
        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<Integer>();
        for (int num : nums2) {
            priorityQueue2.add(num);
        }

        Integer v1 = priorityQueue1.poll();
        Integer v2 = priorityQueue2.poll();

        List<Integer> list = new ArrayList<>();
        while (v1 != null && v2 != null) {
            if (v1.intValue() == v2.intValue()) {
                list.add(v1);
                v1 = priorityQueue1.poll();
                v2 = priorityQueue2.poll();
            } else if (v1 > v2) {
                v2 = priorityQueue2.poll();
            } else {
                v1 = priorityQueue1.poll();
            }
        }

        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
