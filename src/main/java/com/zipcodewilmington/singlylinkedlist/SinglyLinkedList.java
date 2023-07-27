package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node headNode;

    // Constructor
    public SinglyLinkedList(){
        this(null);
    }
    public SinglyLinkedList(Node start){
        headNode = start;
    }

    // Getter!
    public Node getHead() {
        return headNode;
    }

    // Other functions!
    public void add(int value){
        if(headNode == null){
            headNode = new Node(value);
            return;
        }
        addToEnd(headNode, value);
    }
     public void addToEnd(Node currentNode, int value){
        if(currentNode.getNext() == null){
            currentNode.setNext(new Node(value));
            return;
        }
        addToEnd(currentNode.getNext(), value);
     }
}
