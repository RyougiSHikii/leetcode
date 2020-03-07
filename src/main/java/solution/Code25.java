package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/7/3 23:38
 */
public class Code25 {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = null, cur, next;
        cur = head;
        int t;
        if (cur == null)
            return null;

        for (t = 1; t < k; t++) {
            if (cur.next == null)
                break;
            cur = cur.next;
        }
        if (t != k)
            return head;

        cur = head;
        while (k-- > 0 && cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head.next = reverseKGroup(cur, t);
        return pre;
    }

    public static void main(String[] args) {
        Code25 code24 = new Code25();
        ListNode node = code24.new ListNode(1);
        node.next = code24.new ListNode(2);
//        node.next.next = code24.new ListNode(3);
//        node.next.next.next = code24.new ListNode(4);
//        node.next.next.next.next = code24.new ListNode(5);
        node = code24.reverseKGroup(node, 2);
        while (node != null) {
            System.out.print(node.val);
            node = node.next;

            System.out.print("->");
        }
    }
}
