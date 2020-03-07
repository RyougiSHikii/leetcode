package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/4/28 17:36
 */
public class Code5 {


    public String longestPalindrome(String s) {
        if (s.length() == 0)
            return "";
        String palindrome = "" + s.charAt(0);

        int left;
        int right;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 1; i++) {
            int len = 0;
            left = i;
            right = i;
            while (right + 1 < chars.length && chars[i] == chars[right + 1])
                right++;

            for (int j = i; j < chars.length - 1; j++) {
                if (left - len - 1 < 0 || right + len + 1 == chars.length)
                    break;
                if (chars[left - len - 1] != chars[right + len + 1])
                    break;
                len++;
            }
            if (palindrome.length() < right - left + 2 * len + 1) {
                palindrome = s.substring(left - len, right + len + 1);
            }
        }
        return palindrome;
    }

    public String longestPalindrome1(String s) {
        return m3(s);
    }

    public String m1(String s) {
        String result = "";
        String temp;
        for (int i = 0; i < s.length(); ++i) {
            temp = find(s, i);
            if (temp.length() > result.length())
                result = temp;
        }

        return result;
    }

    public String find(String s, int index) {
        int i = index - 1, j = index + 1;
        while (true) {
            if (j < s.length() && s.charAt(j) == s.charAt(index))
                ++j;
            else
                break;
        }

        while (true) {
            if (i >= 0 && s.charAt(i) == s.charAt(index))
                --i;
            else
                break;
        }

        while (true) {
            if (i >= 0 && j < s.length()) {
                if (s.charAt(i) != s.charAt(j)) {
                    return s.substring(i + 1, j);
                }
            } else return s.substring(i + 1, j);

            --i;
            ++j;
        }

    }

    public String m2(String s) {
        if (s.isEmpty()) {
            return s;
        }
        String result = s.substring(0, 1);
        String temp;
        int low, high;
        for (int i = 0; i < s.length() - 1; ++i) {
            low = high = i;
            while (high < s.length() - 1 && s.charAt(high + 1) == s.charAt(low)) {
                high++;
            }
            i = high;

            while (low > 0 && high < s.length() - 1 && s.charAt(low - 1) == s.charAt(high + 1)) {
                high++;
                low--;
            }

            temp = s.substring(low, high + 1);

            if (temp.length() > result.length())
                result = temp;
        }

        return result;
    }

    public static String m4(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int[] range = new int[2];
        char[] str = s.toCharArray();

        int low, high;
        for (int i = 0; i < str.length - 1; ++i) {
            low = high = i;
            while (high < str.length - 1 && str[high + 1] == str[low]) {
                high++;
            }
            i = high;

            while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
                high++;
                low--;
            }

            if (high - low > range[1] - range[0]) {
                range[0] = low;
                range[1] = high;
            }
        }

        return s.substring(range[0], range[1] + 1);
    }

    public String m3(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        //2，保存起始位置，将字符串转为字符数组
        int[] range = new int[2];
        char[] str = s.toCharArray();
        //3,循环字符长度，将当前字符与字符数组和起始位置传入，查找这个字符串的最大回文长度
        for (int i = 0; i < s.length(); i++) {
            i = findLongest(str, i, range);
        }
        return s.substring(range[0], range[1] + 1);

    }

    public static int findLongest(char[] str, int low, int[] range) {
        //1，查找中间部分，判断可以进行high++
        int high = low;
        while (high < str.length - 1 && str[high + 1] == str[low]) {
            high++;
        }
        //2，定位中间部分的最后一个字符，进行两边判断
        int ans = high;
        while (low > 0 && high < str.length - 1 && str[low - 1] == str[high + 1]) {
            low--;
            high++;
        }
        //3，记录最大长度
        if (high - low > range[1] - range[0]) {
            range[0] = low;
            range[1] = high;
        }
        return ans;
    }

    public static void main(String[] args) {
        Code5 code5 = new Code5();
        Longest longest = code5.new Longest();
        System.out.println(longest.longestPalindrome("cbbd"));
    }

    public class Longest {
        public String longestPalindrome(String s) {
            if (s.length() <= 1) {
                return s;
            }
            char[] chars = s.toCharArray();
            p = new boolean[s.length()][s.length()];
            //查询
            int start = 0, end = 0;
            int max = 0;

            //初始化数组
            for (int i = 0; i < p[0].length; i++) {
                p[i][i] = true;
                if (i < s.length() - 1 && chars[i] == chars[i + 1]) {
                    p[i][i + 1] = true;
                    start = i;
                    end = i + 1;
                }
            }

            //dp一级级往上查询
            //i数组长度,j循环起点
            for (int i = 2; i < s.length(); i++) {
                for (int j = 0; j + i < s.length(); j++) {
                    if (dp(chars, j, j + i)) {
                        if (max < i) {
                            start = j;
                            end = j + i;
                            max = i;
                        }
                    }
                }
            }

            return s.substring(start, end + 1);
        }

        boolean[][] p;

        //babad
        private boolean dp(char[] chars, int start, int end) {
            if (p[start + 1][end - 1] && chars[start] == chars[end]){
                p[start][end] = true;
                return true;
            }
            return false;
        }


    }
}
