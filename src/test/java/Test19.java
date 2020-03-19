import org.junit.Test;
import solution.Code19;
import solution.Code19_1;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/6 23:46
 */
public class Test19 {

    @Test
    public void test() {
        Code19 code19 = new Code19();
        Code19.ListNode listNode = new Code19.ListNode(1);
//        listNode.next = new Code19.ListNode(2);
//        listNode.next.next = new Code19.ListNode(4);

        Code19.ListNode result = code19.removeNthFromEnd(listNode, 1);
        System.out.println(result);
    }

    @Test
    public void test1() {
        Code19_1 code19 = new Code19_1();
        Code19_1.ListNode listNode = new Code19_1.ListNode(1);
        listNode.next = new Code19_1.ListNode(2);
        listNode.next.next = new Code19_1.ListNode(4);

        Code19_1.ListNode result = code19.removeNthFromEnd(listNode, 2);
        System.out.println(result);
    }
}
