package card.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/12 0:19
 */
public class HappyNum {


    public boolean isHappy(int n) {
        Set<Integer> history = new HashSet<>();

        while (n != 1) {
            List<Integer> bits = getBits(n);
            n = 0;
            for (Integer bit : bits) {
                n += bit * bit;
            }

            if (history.contains(n)) {
                return false;
            }
            history.add(n);
        }
        return true;
    }


    public List<Integer> getBits(int n) {
        List<Integer> list = new ArrayList<>();
        double division = 1;
        double remainder = 10;
        double num = n % remainder;
        while (n % remainder != n) {
            list.add((int) num);
            division *= 10;
            remainder *= 10;
            num = n % remainder / division;
        }
        list.add((int) num);
        return list;
    }
}
