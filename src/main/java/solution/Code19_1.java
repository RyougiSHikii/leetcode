package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/8 22:53
 */
public class Code19_1 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode first = preHead;
        ListNode second = preHead;

        while (n-- >= 0) {
            second = second.next;
        }

        while (second != null) {
            second = second.next;
            first = first.next;
        }
        first.next = first.next.next;
        return preHead.next;
    }


    public static class ListNode {
        int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
