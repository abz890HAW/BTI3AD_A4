/**
 * The Class Counter.
 *
 * @author Markus Blechschmidt
 * @class der Counter ist für die Aufwandsanalyse.
 */
public class Counter {

    /** counter ist der Zaehlwert fuer den Counter. */
    private int counter = 0;

    public int getCount() {
        return counter;
    }
    public void resetCount() {
        this.counter = 0;
    }
    public void countUp(int add) {
        this.counter++;
    }

}

