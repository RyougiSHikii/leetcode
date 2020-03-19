package card.search;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/3/17 23:13
 */
public class FrequencySort {

    public String frequencySort(String s) {
        PriorityChar[] priorityChars = new PriorityChar[300];

        char[] chars = s.toCharArray();
        for (char c : chars) {
            int index = Character.hashCode(c);
            if (priorityChars[index] == null) {
                priorityChars[index] = new PriorityChar(c);
            } else {
                priorityChars[index].upgrade();
            }
        }
        Queue<PriorityChar> priorityQueue = new PriorityQueue<>(26, (o1, o2) -> o2.getPriority() - o1.getPriority());

        for (PriorityChar aChar : priorityChars) {
            if (aChar == null) {
                continue;
            }
            priorityQueue.add(aChar);
        }

        StringBuilder sb = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            PriorityChar priorityChar = priorityQueue.poll();
            for (int i = 0; i < priorityChar.getPriority(); i++) {
                sb.append(priorityChar.getVal());
            }
        }
        return sb.toString();
    }

    public static class PriorityChar {
        private int priority = 1;
        private Character val;

        public PriorityChar(char c) {
            this.val = c;
        }

        public void upgrade() {
            priority++;
        }

        public int getPriority() {
            return priority;
        }

        public Character getVal() {
            return val;
        }
    }
}
