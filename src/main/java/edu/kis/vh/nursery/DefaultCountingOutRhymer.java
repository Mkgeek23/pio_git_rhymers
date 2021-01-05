package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int SIZE_OF_ARRAY = 12;
    public static final int MAX_IN_ARRAY = SIZE_OF_ARRAY - 1;
    public static final int DEFAULT = -1;

    private int[] numbers = new int[SIZE_OF_ARRAY];

    public int total = DEFAULT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT;
    }

    public boolean isFull() {
        return total == MAX_IN_ARRAY;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }

}
