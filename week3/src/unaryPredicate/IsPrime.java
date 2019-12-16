package unaryPredicate;

/**
 *
 * This class takes an Integer as its parameter, and returns true
 * if the parameter is a prime number.
 *
 * @author Molly Price
 * @version October 2019
 */
public class IsPrime implements UnaryPredicate<Integer> {
    //A test to see if a number is prime
    @Override
    /**
     *
     * The test method takes an Integer as its parameter, and returns true
     * if the parameter is a prime number.
     *
     * @author Molly Price
     * @version October 2019
     */
    public boolean test(Integer n) {
        if (n <= 3){   //Numbers from 0-3 are prime
            return true;
        }
        if (n % 2 == 0 || n % 3 ==0){ //Checks to see if it's divisible by 2 or 3
            return false;
        }
        int i = 5;
        //This is a math mathematical equation I found online to calculate the other prime numbers
        //I just put it into 'code' form
        while (i*i <= n){
            if (n%i == 0 || n % (i+2) ==0){
                return false;
            }
            i = i + 6;
        }
        return true;
    }
}
