package card.search;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/16 23:30
 */
public class Anagram {

    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        int[] b = new int[26];

        a = helper(a, s);
        b = helper(b, t);

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public int[] helper(int[] a, String s) {
        int len = s.length();
        int index;
        for (int i = 0; i < len; i++) {
            index = s.charAt(i) - 'a';
            a[index]++;
        }
        return a;
    }
}
