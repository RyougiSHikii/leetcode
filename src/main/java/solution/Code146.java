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
 * @since 2019/12/29 16:17
 */
public class Code146 {


    private void moveToHead(LinkedNode node) {
        removeNode(node);
        addNodeToHead(node);
    }

    public int get(int key) {
        LinkedNode node = cache.get(key);

        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        LinkedNode node = cache.get(key);

        if (node == null) {
            node = new LinkedNode();
            node.value = value;
            node.key = key;

            addNodeToHead(node);
            cache.put(key, node);

            //如果缓存满删除尾部元素
            if (cache.size() > capacity) {
                cache.remove(tail.prev.key);
                removeNode(tail.prev);
            }
        } else {
            node.value = value;
            moveToHead(node);
        }

    }

    private void removeNode(LinkedNode node) {
        LinkedNode next = node.next;
        LinkedNode prev = node.prev;

        next.prev = prev;
        prev.next = next;
    }

    private void addNodeToHead(LinkedNode node) {
        LinkedNode next = head.next;

        node.next = next;
        node.prev = head;

        next.prev = node;
        head.next = node;
    }

    static class LinkedNode {
        int key;
        int value;
        LinkedNode prev;
        LinkedNode next;
    }

    private int capacity;
    private Map<Integer, LinkedNode> cache;
    private LinkedNode head;
    private LinkedNode tail;

    public Code146(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        head = new LinkedNode();
        tail = new LinkedNode();

        head.next = tail;
        tail.prev = head;
    }
}
