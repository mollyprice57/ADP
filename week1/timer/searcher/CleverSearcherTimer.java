package searcher;

import arrayGenerator.ArrayGenerator;
import arrayGenerator.CleverRandomListingGenerator;
import timer.Timer;

/**
 * A timer implementation for clever searchers that times the findElement method
 *
 * @author Molly Price
 * @version October 2018
 */
public class CleverSearcherTimer extends CleverSearcher implements Timer {

    // All timings will be done with an index of 5
    private final static int K = 5;

    private CleverSearcherTimer(int[] array) {
        super(array, K);
    }

    /**
     * We are timing CleverSearcher.
     *
     * @param size the size of the task to be timed.
     * @return a CleverSearcher of the required size.
     */
    @Override
    public Timer getTimer(int size) {
        ArrayGenerator generator = new CleverRandomListingGenerator(size);
        return new CleverSearcherTimer(generator.getArray());
    }

    /**
     * We are timing the findElement() method.
     */
    @Override
    public void timedMethod() {
        try {
            findElement();
        } catch (IndexingError indexingError) {

        }
    }

    /**
     * Cease timing when the runtime exceeds 5 seconds.
     *
     * @return 5 seconds as the maximum runbtime.
     */
    @Override
    public long getMaximumRuntime() {
        return 5;
    }

    /**
     * Minimum task size (array size) is set to ten, to avoid indexing errors (index is always five).
     * @return minimum task size of ten
     */
    @Override
    public int getMinimumTaskSize() {
        return 10;
    }

    /**
     * Cease timing when the array size exceeds 10^9
     *
     * @return 10^9 as the maximum array size.
     */
    @Override
    public int getMaximumTaskSize() {
        return 10000000;
    }

    public static void main(String[] args) throws IndexingError {
        CleverSearcherTimer timer = new CleverSearcherTimer(null);
        timer.timingSequence();
    }
}
