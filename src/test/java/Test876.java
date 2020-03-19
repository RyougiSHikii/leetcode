import org.junit.Test;
import solution.Code876;
import solution.ListNode;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/9 0:29
 */
public class Test876 {

    @Test
    public void test() {
        Code876 code876 = new Code876();
        ListNode head = new ListNode(1);

        ListNode next = head;
        for (int i = 2; i < 5; i++) {
            next.next = new ListNode(i);
            next = next.next;
        }

        ListNode listNode = code876.middleNode(head);
        System.out.println(listNode);
    }
}
