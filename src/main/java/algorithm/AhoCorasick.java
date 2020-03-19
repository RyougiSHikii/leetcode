package algorithm;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/19 21:42
 */
public class AhoCorasick {

    private Trie trie = new Trie();

    public void insert(List<String> patterns) {
        for (String pattern : patterns) {
            if (StringUtils.isEmpty(pattern)) {
                continue;
            }
            trie.insert(pattern);
        }
    }

    public void buildFailurePointer() {

    }


    public static class AcNode {
        public char val;

        public AcNode failure;

        public AcNode(char val) {
            this.val = val;
        }
    }

}
