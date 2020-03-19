package card.serarch;

import card.search.Duplicate;
import org.junit.Test;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/16 21:58
 */
public class DuplicateTest {

    @Test
    public void test() {
        Duplicate duplicate = new Duplicate();
        int[] nums = {1, 2, 3, 1};
        System.out.println(duplicate.containsDuplicate(nums));
        System.out.println(duplicate.containsDuplicate2(nums));
    }
}
