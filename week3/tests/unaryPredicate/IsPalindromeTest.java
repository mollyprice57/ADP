package unaryPredicate;

import genericMethods.Equals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    private IsPalindrome predicate = new IsPalindrome();

    @Test
    //Tests a valid palindrome
    void testPalindrome() {
        assertTrue(predicate.test("dad"));
    }

    @Test
    //Tests an invalid palindrome
    void testNotPalindrome() {
        assertFalse(predicate.test("cat"));
    }

    @Test
    //Tests a longer palindrome
    void testLongPalindrome() {
        assertTrue(predicate.test("racecar"));
    }

    @Test
    //Tests a valid number palindrome
    void testNumberPalindrome() {
        assertTrue(predicate.test("104401"));
    }

    @Test
    //Tests an invalid number palindrome
    void testNumberNotPalindrome() {
        assertFalse(predicate.test("56759"));
    }

}


