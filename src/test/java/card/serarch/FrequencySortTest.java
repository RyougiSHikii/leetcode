package card.serarch;

import card.search.FrequencySort;
import org.junit.Test;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/18 0:17
 */
public class FrequencySortTest {

    @Test
    public void test() {
        System.out.println(Character.hashCode('z'));
        System.out.println(Character.hashCode('Z'));
        System.out.println(Character.hashCode('9'));
        FrequencySort frequencySort = new FrequencySort();
        System.out.println(frequencySort.frequencySort("Aabb"));
    }
}
