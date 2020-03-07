import org.junit.Test;
import solution.Code141;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/5 15:42
 */
public class Test141 {

    @Test
    public void test() {
        Code141 code141 = new Code141();
        Code141.ListNode listNode = new Code141.ListNode(1);
        System.out.println(code141.hasCycle(listNode));
    }

}
