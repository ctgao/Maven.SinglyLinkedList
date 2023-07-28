package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {
    @Test
    public void sortIntegerTest() {
        //Given
        Integer[] inputValues = new Integer[]{3, 4, 70};
        //Given
        SinglyLinkedList<Integer> expected = new SinglyLinkedList(inputValues[0]);
        expected.add(inputValues[1]);
        expected.add(inputValues[2]);
        SinglyLinkedList<Integer> actual = expected.copy();
        //When
        actual.sort();
        //Then
        Assert.assertTrue(expected.equals(actual));
    }
    @Test
    public void sortIntegerTest1() {
        //Given
        Integer[] inputValues = new Integer[]{300, 4, 70};
        //Given
        SinglyLinkedList<Integer> expected = new SinglyLinkedList<>(inputValues[1]);
        expected.add(inputValues[2]);
        expected.add(inputValues[0]);
        //Given
        SinglyLinkedList<Integer> actual = new SinglyLinkedList(inputValues[0]);
        actual.add(inputValues[1]);
        actual.add(inputValues[2]);
        //When
        actual.sort();
        //Then
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void sortStringTest() {
        //Given
        String[] inputValues = new String[]{"EWWW", "lowercase", "qwerty"};
        //Given
        SinglyLinkedList<String> expected = new SinglyLinkedList<>(inputValues[0]);
        expected.add(inputValues[1]);
        expected.add(inputValues[2]);
        //Given
        SinglyLinkedList<String> actual = expected.copy();
        //When
        actual.sort();
        //Then
        Assert.assertTrue(expected.equals(actual));
    }
    @Test
    public void sortStringTest1() {
        //Given
        String[] inputValues = new String[]{"EWWW", "lowercase", "qwerty"};
        //Given
        SinglyLinkedList<String> expected = new SinglyLinkedList<>(inputValues[0]);
        expected.add(inputValues[1]);
        expected.add(inputValues[2]);
        //Given
        SinglyLinkedList<String> actual = new SinglyLinkedList<>(inputValues[2]);
        actual.add(inputValues[1]);
        actual.add(inputValues[0]);
        //When
        actual.sort();
        //Then
        Assert.assertTrue(expected.equals(actual));
    }
}
