package solution;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/12/30 23:56
 */
public class Code146_2 extends LinkedHashMap<Integer, Integer> {

    private int capacity;

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }

    public Code146_2(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
//        Code146_2 code146_2 = new Code146_2(2);
//        code146_2.put(1, 2);
//        System.out.println(code146_2.get(1));
        Code146_2 code146 = new Code146_2(2);
        code146.put(1, 1);
        code146.put(2, 2);
        System.out.println(code146.get(1));
        code146.put(3, 3);
        System.out.println(code146.get(2));
        code146.put(4, 4);
        System.out.println(code146.get(1));
        System.out.println(code146.get(3));
        System.out.println(code146.get(4));
    }
}
