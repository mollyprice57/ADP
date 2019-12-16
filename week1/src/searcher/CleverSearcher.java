package searcher;

import java.lang.reflect.Array;
import java.util.Arrays;
/**
 * Implements the find (kth) element method by making a smaller array of size K, sorts it,
 * then comparing the larger arrays values to the small array, to see if ones bigger.
 * Which then swaps it out
 *
 *
 * @author Molly Price
 * @version October 2019
 **/

public class CleverSearcher extends Searcher {

    public CleverSearcher(int[] array, int k){
        super(array, k);
    }

    /**
     * <ul>
     *          <li> Make an array of size k and copy first 5 values of big array into it </li>
     *          <li> Sort small array </li>
     *          <li> Loop through array and check if big array[k] is smaller than smallest index of small array starting from k</li>
     *          <li> If it is then move on to next number, otherwise loop through small array and place big array[k] before number that is bigger than it.</li>
     *          <li> Remove smallest from small array</li>
     *          <li> Repeat through big array </li>
     *          <li> Return the entry at start of small array</li>
     *      </ul>
     *
     * @return kth largest element of array which is in the start position of the smallArray
     */

    @java.lang.Override
    public int findElement() throws IndexingError {
        int[] array = getArray();
        int length = getIndex();
        int [] smallArray = Arrays.copyOfRange(array,0,length);
        Arrays.sort(smallArray);
        if (length <= 0 || length > array.length) {
            throw new IndexingError();
        }
        for (int m = length; m < array.length; m++)
        {
            if (array[m] < smallArray[0]){
                continue;
            }
            int count = 0;
            for(int n = 0; n < smallArray.length; n++){

                if(array[m] > smallArray[n]){
                    count++;
                }
            }
            for(int n = 1; n < count; n++){
                smallArray[n-1] = smallArray[n];
            }

            if(count > 0) {
                smallArray[count - 1] = array[m];
            }
        }
        return smallArray[0];
    }
}