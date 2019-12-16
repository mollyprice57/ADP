package unaryPredicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsPrimeTest {

    private IsPrime predicate = new IsPrime();

    @Test
    void testSix() {
        assertFalse(predicate.test(6));
    }

    @Test
    void testThree() {
        assertTrue(predicate.test(3));
    }

    @Test
    void testPrime() {
        assertTrue(predicate.test(59));
    }

    @Test
    void testNotPrime() {
        assertFalse(predicate.test(86));
    }

    @Test
    void testNotBigPrime() {
        assertFalse(predicate.test(5425));
    }

    @Test
    void testBigPrime() {
        assertTrue(predicate.test(1193));
    }

    @Test
    void testPrimeEquation() {
        assertTrue(predicate.test((46 + 27)));
    }

}

