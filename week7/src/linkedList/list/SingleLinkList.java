package linkedList.list;


import linkedList.node.ListNode;
import linkedList.node.SingleLinkNode;

import java.util.concurrent.ThreadFactory;

/**
 * A partial implementation of the List interface.
 * This implementation only implements the T get(int index) method, and the class must, therefore
 * be declared abstract.
 *
 * @param <T> the type of object stored in the list.
 *
 * @author Hugh Osborne
 * @version October 2019
 */
public class SingleLinkList<T> extends BasicList<SingleLinkNode<T>,T> implements List<T> {

    private SingleLinkNode<T> next;
    private SingleLinkNode<T> value;

    @Override
    public T get(int index) throws ListAccessError {
        // Is the list empty?  If so, cannot access the node.
        if (isEmpty()) {
            throw new ListAccessError("Cannot get node.  List is empty.");
        }
        // Is the given index negative?  If so, this is an error.
        if (index < 0) {
            throw new ListAccessError("Cannot get node.  Negative index.");
        }
        ListNode<T> currentNode = getRoot(); // start at the root
        while (index != 0 && currentNode != null) { // walk along the list (if haven't reached the end by hitting null node)
            currentNode = currentNode.getNext(); // by getting next node in the list
            index--; // and reducing index by one
        }
        // Reached the end of the list (by hitting null node)?  If so, cannot access the required node.
        if (currentNode == null) {
            throw new ListAccessError("Cannot get node.  Not enough nodes in the list.");
        }
        // Successfully found node by walking through until index was zero.
        return (T) currentNode;
    }

    @Override
    public void add(int index, T value) throws ListAccessError {
        if (isEmpty()) {
            throw new ListAccessError("Cannot get node.  List is empty.");
        }
        if (index < 0) {
            throw new ListAccessError("Cannot get node.  Negative index.");
        }
        if (index > getLength()) {
            throw new ListAccessError("Cannot get node.  Out of bounds index.");
        }
        //Makes the nodes you want to add
        SingleLinkNode<T> newNode = new SingleLinkNode<>(value);
        //Check to see if node is first in list
        if (root != null) {
            //Checks to see if node is being added to the end
            if(index == getLength()){
                SingleLinkNode<T> prevNode = (SingleLinkNode<T>) get(index);
                prevNode.setNext(newNode);
            }
            if(index != getLength()) {
                //Finds the node in front and connects new node to it
                SingleLinkNode<T> temp = (SingleLinkNode<T>) get(index + 1);
                newNode.setNext(temp);
                //Gets the previous node and connects it to the new node
                SingleLinkNode<T> prevNode = (SingleLinkNode<T>) get(index);
                prevNode.setNext(newNode);
            }
        }
        else {
            //If this is the first node, create a link list
            setRoot(newNode);
        }
        return;
    }


    @Override
    public T remove(int index) throws ListAccessError {
        if (isEmpty()) {
            throw new ListAccessError("Cannot get node.  List is empty.");
        }
        if (index < 0) {
            throw new ListAccessError("Cannot get node.  Negative index.");
        }
        if (index > getLength()) {
            throw new ListAccessError("Cannot get node.  Out of bounds index.");
        }
        //Gets the node around the node you want to delete
        SingleLinkNode<T> deleteNode = (SingleLinkNode<T>) get(index);
        SingleLinkNode<T> pastNode = (SingleLinkNode<T>) get(index-1);
        SingleLinkNode<T> nextNode = (SingleLinkNode<T>) get(index+1);
        if(deleteNode.getNext() == null){
            pastNode.setNext(null);
        }
        else{
            pastNode.setNext(nextNode);
        }
        return null;
    }

    public int getLength() {
        int size = 0;
        ListNode<T> currentNode = getRoot();
        while (currentNode != null) { // walk along the list (if haven't reached the end by hitting null node)
            currentNode = currentNode.getNext(); // by getting next node in the list
            size++; // add one to size counter
        }
        return size;
    }

}




