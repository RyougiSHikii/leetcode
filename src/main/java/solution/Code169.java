package solution;

import java.util.Stack;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/7/16 23:07
 */
public class Code169 {
    public int majorityElement(int[] nums) {
        // [2,2,1,1,1,2,2]
        int major = -1, count = 0;
        for (int num : nums) {
            if (count == 0) {
                major = num;
                count++;
            } else if (major == num) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }

    public static void main(String[] args) {
        Code169 code169 = new Code169();
        int[] arr = {3,2,3};
        System.out.println(code169.majorityElement(arr));
    }
}
