import org.junit.Test;
import solution.Code21;
import solution.Code21_1;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/5 18:57
 */
public class Test21 {

    @Test
    public void test() {
        Code21 code21 = new Code21();

        Code21.ListNode listNode = new Code21.ListNode(1);
        listNode.next = new Code21.ListNode(2);
        listNode.next.next = new Code21.ListNode(4);

        Code21.ListNode listNode2 = new Code21.ListNode(3);
        listNode2.next = new Code21.ListNode(4);
        listNode2.next.next = new Code21.ListNode(7);

        Code21.ListNode listNode1 = code21.mergeTwoLists(listNode, listNode2);
        System.out.println(listNode1);
    }

    @Test
    public void test_1() {
        Code21_1 code21 = new Code21_1();

        Code21_1.ListNode listNode = new Code21_1.ListNode(1);
        listNode.next = new Code21_1.ListNode(2);
        listNode.next.next = new Code21_1.ListNode(4);

        Code21_1.ListNode listNode2 = new Code21_1.ListNode(3);
        listNode2.next = new Code21_1.ListNode(4);
        listNode2.next.next = new Code21_1.ListNode(7);

        Code21_1.ListNode listNode1 = code21.mergeTwoLists(listNode, listNode2);
        System.out.println(listNode1);
    }
}
