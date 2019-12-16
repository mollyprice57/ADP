package searcher;


/**
 * @author Molly Price
 * @version October 2018
 */
class CleverSearcherTest extends SearcherTest {

    protected Searcher createSearcher(int[] array, int index) throws IndexingError {
        return new CleverSearcher(array,index);
    }

}