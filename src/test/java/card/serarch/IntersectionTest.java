package card.serarch;

import card.search.Intersection;
import org.junit.Test;

import java.util.Arrays;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/11 20:40
 */
public class IntersectionTest {

    @Test
    public void test() {
        Intersection intersection = new Intersection();
        int[] nums1 = {1, 2, 3, 1, 4};
        int[] nums2 = {2, 3};

        System.out.println(Arrays.toString(intersection.intersection(nums1, nums2)));
    }
}
