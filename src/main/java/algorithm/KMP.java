package algorithm;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/2/23 17:26
 */

public class KMP {
    public static int kmp(String origin, String pattern) {
        if (origin == null || pattern == null) {
            return -1;
        }
        if (pattern.length() == 0) {
            return 0;
        }
        char[] a = origin.toCharArray();
        char[] b = pattern.toCharArray();
        int[] next = getNext(b);
        int j = 0;
        for (int i = 0; i < origin.length(); i++) {
            while (j > 0 && a[i] != b[j]) {
                j = next[j - 1] + 1;
            }
            if (a[i] == b[j]) {
                j++;
            }
            if (j == b.length) {
                return i - b.length + 1;
            }
        }
        return -1;
    }

    /**
     * @param pattern 模式串
     * @return 计算模式串的next数组
     */
    public static int[] getNext(char[] pattern) {
        int[] next = new int[pattern.length];

        //最长可匹配前缀下标
        int k = -1;
        next[0] = -1;
        for (int i = 1; i < pattern.length; i++) {
            //动态规划， 不停查询次长可访问前缀 例：[aba] xxxx [aba] ->  [aba]->[a]
            while (k != -1 && pattern[i] != pattern[k + 1]) {
                //next[k] 次长可匹配前缀
                k = next[k];
            }
            if (pattern[i] == pattern[k + 1]) {
                k++;
            }
            next[i] = k;
        }
        return next;
    }
}
