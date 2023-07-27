package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest{

    @Test
    public void constructorTest(){
        //Given
        //When
        Node thisNode = new Node();
        //Then
        Assert.assertNull(thisNode.getElement());
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
    public void getElementTest() {
        //Given
        Node thisNode = new Node();
        //When
        Object actual = thisNode.getElement();
        //Then
        Assert.assertNull(actual);
    }

    @Test
    public void setElementTest() {
        //Given
        int expected = 18;
        Node thisNode = new Node();
        //When
        thisNode.setElement(expected);
        //Then
        Assert.assertEquals(expected, thisNode.getElement());
    }

    @Test
    public void getNextTest() {
        //Given
        Node thisNode = new Node();
        //When
        //Then
        Assert.assertEquals(null, thisNode.getNext());
    }

    @Test
    public void setNextTest() {
        //Given
        Node thisNode = new Node(18);
        Node nextNode = new Node();
        //When
        thisNode.setNext(nextNode);
        //Then
        Assert.assertEquals(nextNode, thisNode.getNext());
    }

    @Test
    public void isElementEqualTest(){
        //Given
        Node<Integer> nextNode = new Node();
        //When
        boolean actual = nextNode.isElementEqual(null);
        //Then
        Assert.assertTrue(actual);
    }
    @Test
    public void isElementEqualTest1(){
        //Given
        Node<Integer> nextNode = new Node(30);
        //When
        boolean actual = nextNode.isElementEqual(null);
        //Then
        Assert.assertFalse(actual);
    }
    @Test
    public void isElementEqualTest2(){
        //Given
        String input = "aur naur";
        Node<String> nextNode = new Node(input);
        //When
        boolean actual = nextNode.isElementEqual(input);
        //Then
        Assert.assertTrue(actual);
    }
    @Test
    public void isElementEqualTest3(){
        //Given
        String wrong = "ewwww";
        Node<String> nextNode = new Node("");
        //When
        boolean actual = nextNode.isElementEqual(wrong);
        //Then
        Assert.assertFalse(actual);
    }
}