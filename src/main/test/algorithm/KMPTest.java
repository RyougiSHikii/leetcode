package algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/2/23 17:40
 */
public class KMPTest {

    @Test
    public void getNextTest() {
        int[] expert = {-1, -1, 0, 1, 2, -1, -1};
        Assert.assertArrayEquals(expert, KMP.getNext("ababacd".toCharArray()));
    }

    @Test
    public void kmpTest() {
//        Assert.assertEquals(2, KMP.kmp("hello", "ll"));
//        Assert.assertEquals(-1, KMP.kmp("aaaaa", "bba"));
//        Assert.assertEquals(2, KMP.kmp("aaba", "ba"));
        Assert.assertEquals(2, KMP.kmp("", ""));
    }

}
