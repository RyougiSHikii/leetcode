package algorithm;

/**
 * <p>
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/19 22:31
 */
public class AcNode {
    public char val;
    public boolean isEndChar = false;
    public AcNode[] children = new AcNode[58];
    public AcNode failure;
    public int length;

    public AcNode(char val) {
        this.val = val;
    }

    public AcNode(char val, int length) {
        this.val = val;
        this.length = length;
    }
}
