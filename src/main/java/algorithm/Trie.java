package algorithm;

/**
 * @author violet
 */
public class Trie {

    private AcNode root = new AcNode('/');

    /**
     * 插入字符串
     *
     * @param str
     */
    public void insert(String str) {
        char[] chars = str.toCharArray();

        AcNode node = root;
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 'a';
            if (node.children[index] == null) {
                node.children[index] = new AcNode(chars[i], i + 1);
            }
            node = node.children[index];
        }

        node.isEndChar = true;
    }

    /**
     * 查找字符串是否在树中存在
     *
     * @param str
     */
    public boolean find(String str) {
        char[] chars = str.toCharArray();

        AcNode node = root;
        for (char c : chars) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }

        return node.isEndChar;
    }

    public AcNode getRoot() {
        return root;
    }
}