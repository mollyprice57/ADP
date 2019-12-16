package genericMethods;
/**
 *
 * This class swaps two names in a array
 *
 * @author  Molly Price
 * @version October 2019
 */
public class Swap {
    public static <Names> Names[] Swap(Names[] nameList, int number1, int number2) {
            Names temp = nameList[number1];
            nameList[number1] = nameList[number2];
            nameList[number2] = temp;

        return nameList;
    }
}


