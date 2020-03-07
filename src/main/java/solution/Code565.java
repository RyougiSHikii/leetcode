package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/4/28 16:50
 */
public class Code565 {
    public static void main(String[] args) {
        Code565 code565 = new Code565();
        int nums[] = {5, 4, 0, 3, 1, 6, 2};
        System.out.println(code565.arrayNesting(nums));
    }

    public int arrayNesting(int[] nums) {
        int max = 0;

        //保存是否遍历过
        boolean visit[] = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];

            int len = 1;
            while (tmp != i && len < nums.length) {
                if (visit[tmp ])
                    break;
                visit[tmp] = true;
                tmp = nums[tmp];
                len++;
            }
            if (len > max)
                max = len;
            if (max > nums.length/2)
                return max;
        }
        return max;

    }

}
