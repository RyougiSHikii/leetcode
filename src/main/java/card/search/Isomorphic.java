package card.search;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/17 21:52
 */
public class Isomorphic {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> transMap = new HashMap<>(26);
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char from = s.charAt(i);
            char to = t.charAt(i);
            if (transMap.containsKey(from)) {
                if (transMap.get(from) != to) {
                    return false;
                }
            } else if (transMap.containsValue(to)) {
                return false;
            }
            transMap.put(from, to);
        }
        return true;
    }
}
