package algorithm;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    /**
     * 插入模式船
     * @param patterns
     */
    public void insert(List<String> patterns) {
        for (String pattern : patterns) {
            if (StringUtils.isEmpty(pattern)) {
                continue;
            }
            trie.insert(pattern);
        }
        buildFailurePointer();
    }

    private void buildFailurePointer() {
        AcNode p = trie.getRoot();

        Queue<AcNode> queue = new LinkedList<>();
        while (p != null) {
            for (int i = 0; i < p.children.length; i++) {
                AcNode pc = p.children[i];
                if (pc == null) {
                    continue;
                }
                queue.add(pc);

                AcNode q = p.failure;
                while (q != null) {
                    AcNode qc = q.children[pc.val - 'a'];
                    if (qc == null) {
                        q = q.failure;
                    } else {
                        pc.failure = qc;
                        break;
                    }
                }
                if (pc.failure == null) {
                    pc.failure = trie.getRoot();
                }
            }
            p = queue.poll();
        }
    }

    public void match(String text) {
        char[] chars = text.toCharArray();

        AcNode root = trie.getRoot();
        AcNode node = trie.getRoot();
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - 'a';
            if (index < 0 || index > 26) {
                continue;
            }
            while (node.children[index] == null && node != root) {
                node = node.failure;
            }

            if (node.children[index] != null) {
                node = node.children[index];
            }

            AcNode tmp = node;
            while (tmp != root) {
                if (tmp.isEndChar) {
                    int start = i - tmp.length + 1;
                    System.out.println(text.substring(start, start + tmp.length));
                }
                tmp = tmp.failure;
            }
        }
    }
}
