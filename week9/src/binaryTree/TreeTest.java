package binaryTree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;


class TreeTest {
    /**
     * A test to see if inserting a value works
     */
    @Test
    void testInsert(){
        BinaryTree<Integer> TestTree = new BinaryTree<>();
        TestTree.insert(10);
        assertEquals(TestTree.getValue(), 10);
    }

    /**
     * A test to see if the traversal works
     */
    @Test
    void testTraversal(){
        BinaryTree<Integer> TestTree = new BinaryTree<>();
        TestTree.insert(6);
        TestTree.insert(5);
        TestTree.insert(2);
        TestTree.insert(7);
        TestTree.insert(1);


        ArrayList<Integer> TestArray = new ArrayList<>();
        TestArray.add(6);
        TestArray.add(5);
        TestArray.add(2);
        TestArray.add(1);
        TestArray.add(7);


        List<Integer> TreeList = TestTree.traverse();
        assertEquals(TestArray, TreeList);
    }

    /**
     * A test to see if contains method works
     */
    @Test
    void TestContainsTrue(){
        BinaryTree<Integer> TestTree = new BinaryTree<>();
        TestTree.insert(6);
        TestTree.insert(5);
        TestTree.insert(2);
        TestTree.insert(7);
        TestTree.insert(1);
        assertTrue(TestTree.contains(5));
    }

    /**
     * A test to see if contains method works
     */
    @Test
    void TestContainsFalse(){
        BinaryTree<Integer> TestTree = new BinaryTree<>();
        TestTree.insert(6);
        TestTree.insert(5);
        TestTree.insert(2);
        TestTree.insert(7);
        TestTree.insert(1);
        assertFalse(TestTree.contains(10));
    }


}

