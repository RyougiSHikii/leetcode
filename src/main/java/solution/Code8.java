package solution;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/4/28 19:53
 */
public class Code8 {
    public static void main(String[] args) {
        Code8 code8 = new Code8();
        System.out.println(code8.myAtoi("2147483648"));
    }

    public int myAtoi(String str) {
        char[] chars = str.trim().toCharArray();

        if (chars.length == 0)
            return 0;

        int result = 0;

        int type = 2;//0 -; 1+; 2 null

        if (chars[0] == '-') {
            type = 0;
        } else if (chars[0] == '+') {
            type = 1;
        } else if (chars[0] >= '0' && chars[0] <= '9') {
            result = chars[0] - '0';
        } else {
            return 0;
        }

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                if (type == 0)
                    return -1 * result;
                else
                    return result;
            }
            try {
                int tmp = result * 10;
                if (tmp / 10 != result)
                    throw new Exception();
                result = tmp + chars[i] - '0';
                if (result - (chars[i] - '0') != tmp)
                    throw new Exception();
            } catch (Exception e) {
                if (type == 1 || type == 2)
                    return Integer.MAX_VALUE;
                else
                    return Integer.MIN_VALUE;
            }
        }
        if (type == 0)
            return -1 * result;
        return result;
    }
}
