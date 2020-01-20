package graph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestDepthFirst<T> {

    /**
     * Creates a graph for me to test traverse on
     * Based on the graph from practical document
     * @return
     * @throws GraphError
     */

    DepthFirstTraversal<Integer> makeLargeGraph() throws GraphError {
        DepthFirstTraversal<Integer> testGraph = new DepthFirstTraversal<Integer>();
        testGraph.add(0);
        testGraph.add(1);
        testGraph.add(2);
        testGraph.add(3);
        testGraph.add(4);
        testGraph.add(5);
        testGraph.add(0, 1);
        testGraph.add(0,3);
        testGraph.add(1,2);
        testGraph.add(2,1);
        testGraph.add(2,4);
        testGraph.add(2,5);
        testGraph.add(5,4);
        testGraph.add(4,5);
        return testGraph;
    }

    /**
     * makes a small graph so I can test a traversal route is correct
     * @return
     * @throws GraphError
     */
    DepthFirstTraversal<Integer> makeSmallGraph() throws GraphError {
        DepthFirstTraversal<Integer> testGraph = new DepthFirstTraversal<Integer>();
        testGraph.add(0);
        testGraph.add(1);
        testGraph.add(2);
        testGraph.add(3);
        testGraph.add(0, 1);
        testGraph.add(1,2);
        testGraph.add(2,3);
        testGraph.add(3,0);
        return testGraph;
    }

    /**
     * Checks that the  graph only contains the nodes in the graph
     *
     * @throws GraphError
     */
    @Test
    void testBigGraphTraverse() throws GraphError {
        DepthFirstTraversal<Integer> testGraph = makeLargeGraph();
        List<Integer> traversal = testGraph.traverse();
        List<Integer> rightAnswer = new ArrayList<Integer>();
        rightAnswer.add(0);
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(3);
        rightAnswer.add(4);
        rightAnswer.add(5);
        assertTrue(traversal.containsAll(rightAnswer));
    }

    /**
     * Checks that the traversal is path of 0,1,2,3
     * @throws GraphError
     */
    @Test
    void testSmallGraphTraverse() throws GraphError {
        DepthFirstTraversal<Integer> testGraph = makeSmallGraph();
        List<Integer> traversal = testGraph.traverse();
        List<Integer> rightAnswer = new ArrayList<Integer>();
        rightAnswer.add(0);
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(3);
        assertEquals(traversal, rightAnswer);
    }

    /**
     * check traversal list is the same length
     * as the amount of nodes in the graph
     * @throws GraphError
     */
    @Test
    void testSameSize() throws GraphError{
        DepthFirstTraversal<Integer> testGraph = makeLargeGraph();
        List<Integer> traversal = testGraph.traverse();
        assertEquals(traversal.size(), 6);
    }

    /**
     * Checks that the  graph does a traversal route of
     * 0,3,1,2,5,4
     *
     * @throws GraphError
     */
    @Test
    void testGraphTraverse() throws GraphError {
        DepthFirstTraversal<Integer> testGraph = makeLargeGraph();
        List<Integer> traversal = testGraph.traverse();
        List<Integer> rightAnswer = new ArrayList<Integer>();
        rightAnswer.add(0);
        rightAnswer.add(3);
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(5);
        rightAnswer.add(4);
        assertEquals(traversal, rightAnswer);
    }
}