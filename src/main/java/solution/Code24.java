package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/7/3 21:54
 */
public class Code24 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        ListNode next = head.next;
        if (next == null)
            return head;
        ListNode next_next = next.next;

        head.next = next_next;
        next.next = head;
        head.next = swapPairs(head.next);
        return next;
    }

    public static void main(String[] args) {
        Code24 code24 = new Code24();
        ListNode node = code24.new ListNode(1);
        node.next = code24.new ListNode(2);
        node.next.next = code24.new ListNode(3);
        node.next.next.next = code24.new ListNode(4);
        node = code24.swapPairs(node);
        while (true) {
            System.out.print(node.val);
            node = node.next;
            if (node == null)
                break;
            System.out.print("->");
        }
    }
}
