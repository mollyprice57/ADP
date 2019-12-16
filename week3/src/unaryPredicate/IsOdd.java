package unaryPredicate;

/**
 *
 * This class takes an Integer as its parameter, and returns true
 * if the parameter is an odd number.
 *
 * @author Molly Price
 * @version October 2019
 */

public class IsOdd implements UnaryPredicate<Integer> {
    //Runs a test to check the number is odd
    @Override
    /**
     * Test whether a number is odd.
     *
     * @param n the number to be tested
     * @return true if n is odd.
     */
    public boolean test(Integer n) {
        return n % 2 != 0;
    }
}
