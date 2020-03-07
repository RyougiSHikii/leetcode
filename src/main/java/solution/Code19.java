package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/6 23:03
 */
public class Code19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;

        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }

        int index = length - n;
        head = preHead;
        while (index-- > 0) {
            head = head.next;
        }

        head.next = head.next.next;

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
