package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/12/2 23:42
 */
public class Code28 {

    public static void main(String[] args) {
        Code28 code28 = new Code28();
        System.out.println(code28.strStr("hello", "el"));
    }

    private static final int BASE_FACT = 10;
    private int[] factorial = new int[10000];

    public Code28() {
        //事先计算好阶乘
        factorial[0] = 1;
        for (int i = 1; i < factorial.length; i++) {
            factorial[i] = factorial[i - 1] * BASE_FACT;
        }
    }

    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();

        newFactorial(needleLength);

        int needleHashCode = hashCode(needle, needleLength);

        int[] hashCodes = new int[haystack.length() - needle.length()];
        hashCodes[0] = hashCode(haystack, needleLength);

        if (hashCodes[0] == needleHashCode) {
            return 0;
        }

        for (int i = 1; i < haystack.length() - needleLength; i++) {
            hashCodes[i] = (hashCodes[i - 1] - haystack.charAt(i - 1)) / BASE_FACT + factorial[needleLength - 1] * (haystack.charAt(i));
            if (hashCodes[i] == needleHashCode) {
                if (haystack.substring(0, needleLength).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }

    private void newFactorial(int length) {
        if (length > factorial.length) {
            int[] newFactorial = new int[length];

            System.arraycopy(factorial, 0, newFactorial, 0, factorial.length);

            for (int i = factorial.length; i < length; i++) {
                newFactorial[i] = newFactorial[i - 1] * BASE_FACT;
            }

            factorial = newFactorial;
        }
    }


    private int hashCode(String str, int length) {
        int hash = 0;
        for (int i = 0; i < length; i++) {
            hash += str.charAt(i) * factorial[i];
        }
        return hash;
    }
}
