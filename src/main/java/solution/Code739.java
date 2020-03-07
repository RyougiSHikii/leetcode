package solution;

import java.util.Stack;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2019/7/3 0:17
 */
public class Code739 {

    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            while (true) {
                if (stack.empty()) {
                    stack.push(i);
                    break;
                }
                Integer index = stack.pop();
                if (T[i] > T[index]) {
                    result[index] = i - index;
                } else {
                    stack.push(index);
                    stack.push(i);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Code739 code739 = new Code739();
        int[] t = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(code739.dailyTemperatures(t));
    }
}
