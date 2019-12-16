package unaryPredicate;

import java.sql.Array;
import java.util.ArrayList;

import static java.lang.reflect.Array.getLength;

/**
 *
 * This class takes a string as its parameter, and returns true
 * if the parameter is a palindrome.
 *
 * @author Molly Price
 * @version October 2019
 */

public class IsPalindrome implements UnaryPredicate<String> {
    @Override
    /**
     * Test whether a string is a palindrome.
     *
     * @param n is the string to be tested
     * @return true if n is a palindrome.
     */
    public boolean test(String n) {
        String reverse = new StringBuffer(n).reverse().toString(); //this reverses the string
        if (reverse.equals(n)) { //Compares to see if the reversed string is equal to the original
            return true;
        }
        return false;
    }
}
