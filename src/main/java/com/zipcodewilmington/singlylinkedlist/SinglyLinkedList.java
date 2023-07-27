package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
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
}
