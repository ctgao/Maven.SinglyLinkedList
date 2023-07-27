package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class AddTest {
    @Test
    public void addNodeTest() {
        //Given
        Node node = new Node();
        SinglyLinkedList list = new SinglyLinkedList();
        //When
        list.add(node);
        //Then
        Assert.assertTrue(node.equals(list.getHead()));
    }
    @Test
    public void addNodeTest1() {
        //Given
        Node node = new Node();
        SinglyLinkedList list = new SinglyLinkedList(new Node());
        //When
        list.add(node);
        //Then
        Assert.assertTrue(node.equals(list.getHead().getNext()));
    }

    @Test
    public void addNodeIntegerTest() {
        //Given
        Node<Integer> node = new Node(30);
        SinglyLinkedList<Integer> list = new SinglyLinkedList();
        //When
        list.add(node);
        //Then
        Assert.assertTrue(node.equals(list.getHead()));
    }
    @Test
    public void addNodeIntegerTest1() {
        //Given
        Node<Integer> node = new Node(30);
        SinglyLinkedList<Integer> list = new SinglyLinkedList(new Node());
        //When
        list.add(node);
        //Then
        Assert.assertTrue(node.equals(list.getHead().getNext()));
    }

    @Test
    public void addNodeStringTest() {
        //Given
        Node<String> node = new Node("this trial will be interesting");
        SinglyLinkedList<String> list = new SinglyLinkedList();
        //When
        list.add(node);
        //Then
        Assert.assertTrue(node.equals(list.getHead()));
    }
    @Test
    public void addNodeStringTest1() {
        //Given
        Node<String> node = new Node("this trial will be interesting");
        SinglyLinkedList<String> list = new SinglyLinkedList(new Node());
        //When
        list.add(node);
        //Then
        Assert.assertTrue(node.equals(list.getHead().getNext()));
    }

    @Test
    public void addValueIntegerTest() {
        //Given
        int expected = 30;
        Node<Integer> expectedNode = new Node(expected);
        SinglyLinkedList<Integer> list = new SinglyLinkedList();
        //When
        list.add(expected);
        //Then
        Assert.assertEquals(expectedNode, list.getHead());
    }
    @Test
    public void addValueIntegerTest1() {
        //Given
        int expected = 30;
        Node<Integer> expectedNode = new Node(expected);
        SinglyLinkedList<Integer> list = new SinglyLinkedList(new Node());
        //When
        list.add(expected);
        //Then
        Assert.assertEquals(expectedNode, list.getHead().getNext());
    }

    @Test
    public void addValueStringTest() {
        //Given
        String expected = "nothin";
        SinglyLinkedList<String> list = new SinglyLinkedList();
        //When
        list.add(expected);
        //Then
        Assert.assertEquals(expected, list.getHead().getElement());
    }
    @Test
    public void addValueStringTest1() {
        //Given
        String expected = "nothin";
        SinglyLinkedList<String> list = new SinglyLinkedList(new Node<String>());
        //When
        list.add(expected);
        //Then
        Assert.assertEquals(expected, list.getHead().getNext().getElement());
    }
}
