package solution;

import java.util.*;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/5 15:34
 */
public class Code141 {

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodesSeen = new HashSet<>();
        while (head !=  null) {
            if (nodesSeen.contains(head)) {
                return true;
            }
            nodesSeen.add(head);
            head = head.next;
        }
        return false;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
