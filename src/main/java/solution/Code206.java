package solution;


/*  <p>
  TODO
  </p>
 
  @author violet
  @version 1.0
  @since 2020/1/2 15:56*/

public class Code206 {


    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next;

        while (head != null) {
            next = head.next;

            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}
