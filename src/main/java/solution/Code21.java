package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/5 18:33
 */
public class Code21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);

        ListNode tmpList = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tmpList.next = l1;
                l1 = l1.next;
            } else {
                tmpList.next = l2;
                l2 = l2.next;
            }
            tmpList = tmpList.next;
        }

        if (l1 == null) {
            tmpList.next = l2;
        } else {
            tmpList.next = l1;
        }
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
