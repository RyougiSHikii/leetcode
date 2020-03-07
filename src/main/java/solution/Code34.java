package solution;

import java.util.Arrays;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/8/19 23:56
 */
public class Code34 {
    public static void main(String[] args) {
        int[] nums = {5, 5};

        System.out.println(Arrays.toString(searchRange(nums, 5)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int[] result = {-1, -1};

        //第一个
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid;
            } else {
                start = mid;
            }

        }
        if (nums[start] == target) {
            result[0] = start;
        } else if (nums[end] == target) {
            result[0] = end;
        }
        start = 0;
        end = nums.length - 1;
        //第二个
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid;
            } else {
                end = mid;
            }

        }
        if (nums[start] == target) {
            result[1] = start;
        } else if (nums[end] == target) {
            result[1] = end;
        }

        return result;
    }
}
