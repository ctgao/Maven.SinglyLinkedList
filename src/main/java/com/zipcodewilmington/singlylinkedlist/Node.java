package com.zipcodewilmington.singlylinkedlist;

public class Node<T extends Comparable<T>> {
    private T element;
    private Node<T> next;

    // Constructors!
    public Node(){
        this(null, null);
    }
    public Node(T i){
        this(i, null);
    }
    public Node(T i, Object o) {
        element = i;
        next = (Node) o;
    }

    // Getters and setters!
    public T getElement() {
        return element;
    }
    public void setElement(T element) {
        this.element = element;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        Node n = (Node) o;
        return isNextEqual(n) && isElementEqual((T) n.element);
    }

    private boolean isNextEqual(Node n) {
        if(this.next == null && n.next == null){
            return true;
        }
        if(this.next == null || n.next == null){
            return false;
        }
        return this.next.equals(n.next);
    }

    protected boolean isElementEqual(T value) {
        if(this.element == null && value == null){
            return true;
        }
        if(this.element == null || value == null){
            return false;
        }
        return this.element.equals(value);
    }
}
