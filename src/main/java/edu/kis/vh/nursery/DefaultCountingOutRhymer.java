package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int INT = 12;
    private static final int INT1 = -1;
    private final int[] NUMBERS = new int[INT];

    private int total = INT1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INT1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INT1;
        return NUMBERS[total--];
    }


}
