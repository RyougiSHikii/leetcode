package algorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p>
 *
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/11 1:51
 */
public class TrieTest {


    @Test
    public void insertTest() {
        Trie trie = new Trie();
        trie.insert("test");
        trie.insert("testt");
        trie.insert("taba");
        System.out.println(trie.find("test"));
        System.out.println(trie.find("testt"));
        System.out.println(trie.find("tab"));
        System.out.println(trie.find("taba"));

        Assert.assertFalse("teste应当不存在",trie.find("teste"));
    }
}
