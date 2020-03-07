package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/7/2 22:10
 */
public class Code242 {


    public static boolean isAnagram(String s, String t) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Code242.isAnagram("a", "ab"));
    }
}
