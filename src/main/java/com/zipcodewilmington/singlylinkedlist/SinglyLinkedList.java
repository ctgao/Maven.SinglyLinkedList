package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>> {
    private Node<T> headNode;

    // Constructor
    public SinglyLinkedList(){
        headNode = null;
    }
    public SinglyLinkedList(T headValue){
        add(headValue);
    }
    public SinglyLinkedList(Node start){
        add(start);
    }

    // Getter and Setter!
    public Node getHead() {
        return headNode;
    }

    // Other functions!
    // starting with adding stuffs
    public void add(T value){
        add(new Node<T>(value));
    }
    public void add(Node n){
        if(headNode == null){
            headNode = n;
            return;
        }
        addToEnd(headNode, n);
    }
    private void addToEnd(Node currentNode, Node n){
        if(currentNode.getNext() == null){
            currentNode.setNext(n);
            return;
        }
        addToEnd(currentNode.getNext(), n);
    }

    public void remove(int index) {
        //out of bounds exception handling -
        if(index >= size()){
            return;
        }
        if (index == 0) {
            // removing from the beginning so we have to change the head too
            headNode = headNode.getNext();
        }
        // don't forget to reset head node!
        Node<T> previousNode = headNode;
        Node<T> currentNode = headNode;
        int counter = 0;
        // use a while loop to keep track of both the index and the nodes surrounding the one
        while(counter < index){
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            counter++;
        }
        // let's see how we remove it now that we have the surrounding nodes
        if(currentNode == null){
            previousNode.setNext(null);
        }
        else{
            previousNode.setNext(currentNode.getNext());
        }
    }

    public int size() {
        return size(headNode);
    }

    private int size(Node<T> currentNode) {
        if(currentNode == null){
            return 0;
        }
        return size(currentNode.getNext()) + 1;
    }

    public int find(T elementToFind) {
        return find(elementToFind, headNode, 0);
    }

    private int find(T elementToFind, Node<T> currentNode, int idx) {
        if(currentNode == null){
            return -1;
        }
        if(currentNode.isElementEqual(elementToFind)){
            return idx;
        }
        return find(elementToFind, currentNode.getNext(), idx + 1);
    }

    public boolean contains(T elementToFind) {
        return find(elementToFind) != -1;
    }

    public Node get(int idx) {
        return get(idx, headNode);
    }

    private Node get(int idx, Node<T> currentNode){
        if(idx == 0){
            return currentNode;
        }
        return get(idx - 1, currentNode.getNext());
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        SinglyLinkedList<T> other = (SinglyLinkedList<T>) o;
        if(this.headNode == null && other.headNode == null){
            return true;
        }
        else if(this.headNode == null || other.headNode == null){
            return false;
        }
        else{
            return this.headNode.equals(other.headNode);
        }
    }

    public SinglyLinkedList<T> copy() {
        SinglyLinkedList<T> result = new SinglyLinkedList<>();
        // for all elements in the previous linked list, add them to this one
        copy(result, headNode);
        return result;
    }

    private void copy(SinglyLinkedList<T> result, Node<T> currentNode) {
        if(currentNode == null){
            return;
        }
        result.add(new Node<>(currentNode.getElement()));
        copy(result, currentNode.getNext());
    }

    public void sort() {
        if(headNode == null){
            return;
        }
        // not sure if this is the most efficient sorting method but this is what i got
        // basically, swap if your neighbor is smaller than you
        for(int i = size() - 1; i > 0; i--){
            boolean noMoreSwaps = true;
            // always start at the beginning
            int tempIdx = 0;
            Node<T> previousNode = null;
            Node<T> currentNode = headNode;
            Node<T> nextNode = currentNode.getNext();
            while(tempIdx < i){
                if(currentNode.getElement().compareTo(nextNode.getElement()) > 0){
                    // current node element is greater than next node element
                    // then DO THE SWAP
                    if(previousNode == null){
                        // at the beginning of the linked list
                        headNode = nextNode;
                    }
                    else{
                        previousNode.setNext(nextNode);
                    }
                    currentNode.setNext(currentNode.getNext().getNext());
                    nextNode.setNext(currentNode);
                    noMoreSwaps = false;
                }
                else {
                    //comparison fails, update values
                    currentNode = currentNode.getNext();
                }
                if(previousNode == null){
                    previousNode = headNode;
                }
                else {
                    previousNode = previousNode.getNext();
                }
                nextNode = currentNode.getNext();
                // update index
                tempIdx++;
            }
            if(noMoreSwaps){
                return;
            }
        }
    }
}
