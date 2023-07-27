package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void constructorTest(){
        //Given
        int expected = 0;
        //When
        Node thisNode = new Node();
        //Then
        Assert.assertEquals(expected, thisNode.getElement());
        Assert.assertEquals(null, thisNode.getNext());
    }
    @Test
    public void constructorTest1(){
        //Given
        int expected = 18;
        //When
        Node thisNode = new Node(expected);
        //Then
        Assert.assertEquals(expected, thisNode.getElement());
        Assert.assertEquals(null, thisNode.getNext());
    }
    @Test
    public void constructorTest2(){
        //Given
        int expected = 27;
        Node secondNode = new Node();
        //When
        Node thisNode = new Node(expected, secondNode);
        //Then
        Assert.assertEquals(expected, thisNode.getElement());
        Assert.assertEquals(secondNode, thisNode.getNext());
    }

    @Test
    public void getElement() {
        //Given
        int expected = 0;
        //When
        Node thisNode = new Node();
        //Then
        Assert.assertEquals(expected, thisNode.getElement());
    }

    @Test
    public void setElement() {
        //Given
        int expected = 18;
        Node thisNode = new Node();
        //When
        thisNode.setElement(expected);
        //Then
        Assert.assertEquals(expected, thisNode.getElement());
    }

    @Test
    public void getNext() {
        //Given
        Node thisNode = new Node();
        //When
        //Then
        Assert.assertEquals(null, thisNode.getNext());
    }

    @Test
    public void setNext() {
        //Given
        Node thisNode = new Node(18);
        Node nextNode = new Node();
        //When
        thisNode.setNext(nextNode);
        //Then
        Assert.assertEquals(nextNode, thisNode.getNext());
    }
}