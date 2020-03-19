package algorithm;

/**
 * @author violet
 */
public class Trie {

    private TrieNode parent = new TrieNode('/');

    /**
     * 插入字符串
     *
     * @param str
     */
    public void insert(String str) {
        char[] chars = str.toCharArray();

        TrieNode node = parent;
        for (char c : chars) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode(c);
            }
            node = node.children[index];
        }
        node.isEndChar = true;
    }

    /**
     * 查找字符串
     *
     * @param str
     */
    public boolean find(String str) {
        char[] chars = str.toCharArray();

        TrieNode node = parent;
        for (char c : chars) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        if (node.isEndChar) {
            return true;
        } else {
            return false;
        }
    }


    public static class TrieNode {
        public char val;
        public boolean isEndChar = false;
        public TrieNode[] children = new TrieNode[26];
        public TrieNode failure;

        public TrieNode(char val) {
            this.val = val;
        }
    }


}