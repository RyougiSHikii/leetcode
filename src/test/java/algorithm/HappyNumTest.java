package algorithm;

import card.search.HappyNum;
import org.junit.Test;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/12 0:22
 */
public class HappyNumTest {

    @Test
    public void test() {
        //3456 3*1000+4*100+4*10+5*1
        System.out.println(3456 % 10);
        System.out.println(3456 % 100);
        System.out.println(3456 % 1000);
        System.out.println(3456 % 10000);

        System.out.println(3456 % 10);
        System.out.println(3456 % 100 / 10);
        System.out.println(3456 % 1000 / 100);
        System.out.println(3456 % 10000 / 1000);
    }

    private HappyNum happyNum = new HappyNum();

    @Test
    public void getBits() {
        System.out.println(happyNum.getBits(15));
        System.out.println(happyNum.getBits(10));
        System.out.println(happyNum.getBits(100));
        System.out.println(happyNum.getBits(1000));
        System.out.println(happyNum.getBits(10000));
        System.out.println(happyNum.getBits(12345600));
        System.out.println(happyNum.getBits(1123210));
    }

    @Test
    public void isHappy() {
        System.out.println(happyNum.isHappy(1819140969));
        System.out.println(happyNum.isHappy(19));
    }
}
