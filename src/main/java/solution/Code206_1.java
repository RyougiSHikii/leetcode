package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/2 21:15
 */
public class Code206_1 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode p = reverseList(head.next);

        head.next.next = head;
        head.next = null;
        return p;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

}
