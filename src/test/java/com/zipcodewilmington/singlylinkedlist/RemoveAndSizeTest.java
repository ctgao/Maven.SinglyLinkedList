package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**z
 * Created by leon on 1/10/18.
 */
public class RemoveAndSizeTest {
    @Test
    public void sizeTest(){
        //Given
        int expected = 2;
        SinglyLinkedList list = new SinglyLinkedList(new Node());
        list.add(new Node<>());
        //When
        int actual = list.size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sizeTest1(){
        //Given
        int expected = 0;
        SinglyLinkedList list = new SinglyLinkedList();
        //When
        int actual = list.size();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeFromBeginningTest() {
        //Given
        int expected = 2;
        SinglyLinkedList list = new SinglyLinkedList(new Node());
        list.add(new Node<>());
        list.add(new Node<>());
        //When
        list.remove(0);
        //Then
        Assert.assertEquals(expected, list.size());
    }
    @Test
    public void removeFromMiddleTest() {
        //Given
        int expected = 2;
        SinglyLinkedList list = new SinglyLinkedList(new Node());
        list.add(new Node<>());
        list.add(new Node<>());
        //When
        list.remove(1);
        //Then
        Assert.assertEquals(expected, list.size());
    }
    @Test
    public void removeFromEndTest() {
        //Given
        int expected = 2;
        SinglyLinkedList list = new SinglyLinkedList(new Node());
        list.add(new Node<>());
        list.add(new Node<>());
        //When
        list.remove(2);
        //Then
        Assert.assertEquals(expected, list.size());
    }
}
