package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class GetAndCopyTest {
    @Test
    public void getIntegerTest() {
        //Given
        int index = 2;
        Node<Integer> nodeToReturn = new Node<>(70);
        SinglyLinkedList<Integer> list = new SinglyLinkedList(new Node());
        list.add(new Node<>());
        list.add(nodeToReturn);
        //When
        Node actual = list.get(index);
        //Then
        Assert.assertTrue(nodeToReturn.equals(actual));
    }

    @Test
    public void getStringTest() {
        //Given
        int index = 1;
        Node<String> nodeToReturn = new Node<>("minsoo");
        SinglyLinkedList<String> list = new SinglyLinkedList(new Node());
        list.add(nodeToReturn);
        list.add(new Node<>());
        //When
        Node actual = list.get(index);
        //Then
        Assert.assertTrue(nodeToReturn.equals(actual));
    }

    @Test
    public void getCopyIntegerTest() {
        //Given
        SinglyLinkedList<Integer> expected = new SinglyLinkedList(new Node());
        expected.add(new Node<>(70));
        expected.add(new Node<>(20));
        //When
        SinglyLinkedList<Integer> actual = expected.copy();
        //Then
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void getCopyStringTest() {
        //Given
        SinglyLinkedList<String> expected = new SinglyLinkedList(new Node());
        expected.add(new Node<>("minsoo"));
        expected.add(new Node<>());
        //When
        SinglyLinkedList<String> actual = expected.copy();
        //Then
        Assert.assertTrue(expected.equals(actual));
    }
}
