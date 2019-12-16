package arraySorter;
/**
 * The implementation of selection sort
 *
 * @author Molly Price
 * @version November 2019
 */
public class SelectionSort <T extends Comparable<? super T>> implements ArraySort<T> {
    /**
     * Sorts an array.
     *
     * @param array the array to be sorted.
     * @return the sorted array.
     */
    public T[] sort(T[] array) {
        int length = array.length;
        for (int i = 0; i < length-1; i++){
            int midValue = i;
            for (int j = i+1; j < length; j++){
                if (array[j].compareTo(array[midValue]) < 0){
                        midValue = j;
                }
            }
            T temp = array[midValue];
            array[midValue] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
