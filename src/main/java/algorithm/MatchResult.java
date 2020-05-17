package algorithm;

/**
 * <p>
 * 匹配结果
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/29 0:58
 */
public class MatchResult {

    public MatchResult(int start, String word) {
        this.start = start;
        this.length = word.length();
        this.word = word;
        this.end = this.start + this.length;
    }

    /**
     * 匹配词开始下标
     */
    private int start;

    /**
     * 匹配词结尾下标
     */
    private int end;

    /**
     * 匹配词长度
     */
    private int length;

    /**
     * 匹配的单词
     */
    private String word;


    public int getLength() {
        return length;
    }

    public String getWord() {
        return word;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
