import org.junit.Test;
import solution.Code104;
import solution.TreeNode;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/9 22:56
 */
public class Test104 {

    @Test
    public void test() {
        Code104 code104 = new Code104();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(20);

        treeNode.right.left = new TreeNode(3);
        treeNode.right.right = new TreeNode(4);
        System.out.println(code104.maxDepth(treeNode));

    }
}
