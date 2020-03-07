package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/8/19 23:02
 */
public class Code278 {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2));
    }

    public static int firstBadVersion(int n) {
        int start = 0, end = n ;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return start + 1;
    }

    static boolean isBadVersion(int version) {
        if (version == 1)
            return true;
        return false;
    }

}
