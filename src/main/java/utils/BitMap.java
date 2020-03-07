package utils;

import java.util.BitSet;

/**
 * <p>
 * TODO
 * </p>
 *
 * @author violet
 * @version 1.0
 * @since 2020/1/10 23:30
 */
public class BitMap {
    private char[] bytes;
    private int nBits;

    public BitMap(int nBits) {
        this.nBits = nBits;
        this.bytes = new char[nBits / 16 + 1];
    }

    public void set(int k) {
        if (k > nBits) return;
        int byteIndex = k / 16;
        int bitIndex = k % 16;
        bytes[byteIndex] |= (1 << bitIndex);
    }

    public boolean get(int k) {
        if (k > nBits) return false;
        int byteIndex = k / 16;
        int bitIndex = k % 16;
        return (bytes[byteIndex] & (1 << bitIndex)) != 0;
    }
}
