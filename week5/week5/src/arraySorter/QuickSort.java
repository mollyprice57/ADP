package arraySorter;
/**
 * The implementation of quick sort
 *
 * @author Molly Price
 * @version November 2019
 */
public class QuickSort <T extends Comparable<? super T>> implements ArraySort<T> {
    /**
     * Sorts an array.
     *
     * @param array the array to be sorted.
     * @return the sorted array.
     */
    public T[] sort(T[] array) {
        quickSort(array, 0, array.length-1);
        return array;
    }

    public void quickSort(T[] array, int left, int right){
        //Check to see if array has contents
        if (array.length == 0 || array == null) {
            return;
        }
      if (left >= right){
          return;
      }
      int midPoint = (left + right) / 2;
      T pivot = array[midPoint];
      int index = partition(array, left, right, pivot);
      quickSort(array, left, index-1);
      quickSort(array, index, right);
    }

    private int partition(T[] array, int left, int right, T pivot) {
        while (left <= right) {
            while (array[left].compareTo(pivot) < 0) {
                left++;
            }
            while (array[right].compareTo(pivot) > 0) {
                right--;
            }
            if (left <= right){
                T temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
      return left;
    }
}






