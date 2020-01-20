package graph;

import java.util.*;

public class DepthFirstTraversal<T> extends AdjacencyGraph<T> implements Traversal<T> {

    /**
     * Traversal is a list to keep track of the nodes I've visited
     * backTrack is a queue of places I've been so I can back track
     */
    private List<T> traversal = new ArrayList<T>(); // traversal list
    private Queue<T> backTrack = new ArrayDeque<T>(); // back track queue

    /**
     * Preforms a depth first traversal in the graph
     * @return
     * @throws GraphError
     */
   @Override
    public List<T> traverse() throws GraphError {
       T currentNode = getUnvisitedNode();  //gets an unvisited node
       int graphSize = getNoOfNodes(); //Gets the amount of nodes in graph
       while (currentNode != null && traversal.size() != graphSize) { //Checks if traversal is finished
           if (!traversal.contains(currentNode)) {
               traversal.add(currentNode);
           }
           Set<T> nodeNeighbours = getNeighbours(currentNode); //Gets neighbours of current node
           if (!nodeNeighbours.isEmpty()) {
               backTrack.add(currentNode);
               for (T t : nodeNeighbours) {
                   if (!visited(t)) { //Checks the neighbours haven't been visited
                       currentNode = t;
                   }
               }
           }
           if (nodeNeighbours.isEmpty()) { //If there's no neighbours back tracks to previous node
               currentNode = backTrack.remove();
           }
       }
       return traversal;
    }

    /**
     * Gets an unvisited node
     * @return
     */
    private T getUnvisitedNode() {
        for (T node: getNodes()) { // check all the nodes
            if (!visited(node)) { // if this node has not been visited
                return node;
            }
        }
        return null; // so return null
    }

    /**
     * Checks if a node is visited
     * @param node
     * @return
     */
    private boolean visited(T node) {
        return
                traversal.contains(node); // the node has been visited

    }

}
