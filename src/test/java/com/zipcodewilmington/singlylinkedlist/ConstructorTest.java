package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {
    @Test
    public void constructorTest(){
        //Given
        //When
        SinglyLinkedList list = new SinglyLinkedList();
        //Then
        Assert.assertNotNull(list);
        Assert.assertNull(list.getHead());
    }
    @Test
    public void constructorTest1(){
        //Given
        Node node = new Node();
        //When
        SinglyLinkedList list = new SinglyLinkedList(node);
        //Then
        Assert.assertNotNull(list);
        Assert.assertTrue(node.equals(list.getHead()));
    }

    @Test
    public void constructorIntegerTest(){
        //Given
        int expected = 30;
        //When
        SinglyLinkedList<Integer> list = new SinglyLinkedList(expected);
        //Then
        Assert.assertNotNull(list.getHead());
        Assert.assertEquals(expected, list.getHead().getElement());
    }
    @Test
    public void constructorStringTest(){
        //Given
        String expected = "painandsuffer";
        //When
        SinglyLinkedList list = new SinglyLinkedList(expected);
        //Then
        Assert.assertNotNull(list.getHead());
        Assert.assertEquals(expected, list.getHead().getElement());
    }
}
