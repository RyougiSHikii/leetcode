package card.serarch;

import card.search.Isomorphic;
import org.junit.Test;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/17 22:21
 */
public class IsomorphicTest {

    @Test
    public void test() {
        Isomorphic isomorphic = new Isomorphic();
        System.out.println(isomorphic.isIsomorphic("ab", "aa"));
    }
}
