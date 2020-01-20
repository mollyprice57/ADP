package graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class TopologicalSortClass<T> extends AdjacencyGraph<T> implements TopologicalSort<T>{

    Stack<T> sort; // contains the sort
    Set<T> visiting = new HashSet<T>(); // nodes that are being visited, but not yet added to the sort

    @Override
    public List<T> getSort() throws GraphError {
        return null;
    }
}
