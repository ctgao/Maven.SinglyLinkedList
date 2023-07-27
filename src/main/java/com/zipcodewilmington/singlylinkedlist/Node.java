package com.zipcodewilmington.singlylinkedlist;

public class Node {
    private int element;
    private Node next;

    // Constructors!
    public Node(){
        this(0, null);
    }
    public Node(int i){
        this(i, null);
    }
    public Node(int i, Object o) {
        element = i;
        next = (Node) o;
    }

    // Getters and setters!
    public int getElement() {
        return element;
    }
    public void setElement(int element) {
        this.element = element;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
