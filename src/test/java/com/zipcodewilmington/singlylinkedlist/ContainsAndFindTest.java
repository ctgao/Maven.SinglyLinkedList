package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class ContainsAndFindTest {
    @Test
    public void findIntegerTest() {
        //Given
        int expected = 0;
        int toFind = 50;
        Node node = new Node(toFind);
        SinglyLinkedList list = new SinglyLinkedList(node);
        list.add(new Node<>());
        //When
        int actual = list.find(toFind);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findIntegerTest1() {
        //Given
        int expected = 2;
        int toFind = 50;
        Node node = new Node(toFind);
        SinglyLinkedList list = new SinglyLinkedList(new Node<>());
        list.add(new Node<>());
        list.add(node);
        //When
        int actual = list.find(toFind);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void cannotFindIntegerTest() {
        //Given
        int expected = -1;
        int toFind = 50;
        Node node = new Node();
        SinglyLinkedList list = new SinglyLinkedList(new Node<>());
        list.add(new Node<>());
        list.add(node);
        //When
        int actual = list.find(toFind);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findStringTest() {
        //Given
        int expected = 0;
        String toFind = "hello";
        Node node = new Node(toFind);
        SinglyLinkedList list = new SinglyLinkedList(node);
        list.add(new Node<>());
        //When
        int actual = list.find(toFind);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void findStringTest1() {
        //Given
        int expected = 2;
        String toFind = "heyo";
        Node node = new Node(toFind);
        SinglyLinkedList list = new SinglyLinkedList(new Node<>());
        list.add(new Node<>());
        list.add(node);
        //When
        int actual = list.find(toFind);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void cannotFindStringTest() {
        //Given
        int expected = -1;
        String toFind = "hey hi byeeeee";
        Node node = new Node();
        SinglyLinkedList list = new SinglyLinkedList(new Node<>());
        list.add(new Node<>());
        list.add(node);
        //When
        int actual = list.find(toFind);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsIntegerTest() {
        //Given
        boolean expected = true;
        int toFind = 89;
        Node node = new Node(toFind);
        SinglyLinkedList list = new SinglyLinkedList(node);
        list.add(new Node<>());
        //When
        boolean actual = list.contains(toFind);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void doesNotContainIntegerTest() {
        //Given
        boolean expected = false;
        int toFind = 89;
        Node node = new Node(0);
        SinglyLinkedList list = new SinglyLinkedList(node);
        list.add(new Node<>());
        //When
        boolean actual = list.contains(toFind);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsStringTest() {
        //Given
        boolean expected = true;
        String toFind = "surahbi";
        Node node = new Node(toFind);
        SinglyLinkedList list = new SinglyLinkedList(node);
        list.add(new Node<>());
        //When
        boolean actual = list.contains(toFind);
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void doesNotContainStringTest() {
        //Given
        boolean expected = false;
        String toFind = "SHERBERTTTT";
        Node node = new Node(0);
        SinglyLinkedList list = new SinglyLinkedList(node);
        list.add(new Node<>());
        //When
        boolean actual = list.contains(toFind);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
