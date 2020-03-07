package solution;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/2 14:51
 */
public class Code146_3 {

    private LinkedNode head;
    private LinkedNode tail;
    private int capacity;
    private Map<Integer, LinkedNode> cache;


    public Code146_3(int capacity) {
        cache = new HashMap<>();
        this.capacity = capacity;
        head = new LinkedNode();
        tail = new LinkedNode();

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        LinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        } else {
            moveNodeToHead(node);
            return node.value;
        }
    }

    public void put(int key, int value) {
        LinkedNode node = cache.get(key);
        if (node == null) {
            node = new LinkedNode();
            node.value = value;
            node.key = key;

            addNode(node);
            cache.put(key, node);
            if (cache.size() > capacity) {
                cache.remove(tail.prev.key);
                removeNode(tail.prev);
            }
        } else {
            node.value = value;
            moveNodeToHead(node);
        }
    }

    public void removeNode(LinkedNode node) {
        LinkedNode next = node.next;
        LinkedNode prev = node.prev;

        prev.next = next;
        next.prev = prev;
    }

    public void addNode(LinkedNode node) {
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    public void moveNodeToHead(LinkedNode node) {
        removeNode(node);
        addNode(node);
    }


    public static class LinkedNode {
        private int key;
        private int value;
        private LinkedNode prev;
        private LinkedNode next;
    }
}
