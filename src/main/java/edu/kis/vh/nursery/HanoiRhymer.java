package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer dziedziczy po klasie DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Stała INT1
     */
    public static final int INT1 = 0;
    /**
     * Zmienna typu int, która przechowuje ilość odrzuconych wyliczeń
     */
    int totalRejected = INT1;

    /**
     * @return zwraca ilość odrzuconych wyliczeń
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * @param in - liczba, którą odkładamy na stosie
     *           metoda odkłada parametr in na stos
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
