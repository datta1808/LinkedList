package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    // Created Simple Linked List and Added to the First Position
    @Test
    public void GivenThreeNumbersWhenAddedToLinkedListShouldAddedtoTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myFirstNode));
        Assert.assertEquals(true, result);
    }

    // Created Simple Linked List and Added to the Last Position
    @Test
    public void GivenThreeNumbersWhenAddedToLinkedListShouldAddedtoBottom() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assert.assertEquals(true, result);
    }

    // Insert a Node in Between the Nodes
    @Test
    public void GivenANodeInsertedInBetweenResultingNodesReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insertNode(myFirstNode, mySecondNode);
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assert.assertEquals(true, result);
    }

    // Remove First Node
    @Test
    public void PopNodeFromFrontShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        INode<Integer> deletedNode = myLinkedList.popFirst();
        Assert.assertEquals(deletedNode, myThirdNode);
    }

    // Remove Last Node
    @Test
    public void PopNodeFromLastShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        INode<Integer> deletedNode = myLinkedList.popLast();
        Assert.assertEquals(deletedNode, myFirstNode);
    }

    // Search Node with given data
    @Test
    public void SearchNodeForGivenDataIfFoundShouldReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        INode searchNode = myLinkedList.searchNode(30);
        Assert.assertEquals(searchNode, mySecondNode);
    }

    // Search dataNode and Insert the Node
    @Test
    public void SearchDataNodeForGivenDataIfFoundShouldInsertGivenNodeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        INode searchNode = myLinkedList.searchNode(30);
        myLinkedList.insertNode(searchNode, myFourthNode);
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(searchNode)
                && myLinkedList.head.getNext().getNext().equals(myFourthNode) && myLinkedList.tail.equals(myFirstNode));
        Assert.assertEquals(true, result);
    }

    // Search dataNode and Delete the Node return size
    @Test
    public void DeleteNodeFromLinkedlistIfDeletedShouldReturnSizeAndReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(40);
        MyNode<Integer> myThirdNode = new MyNode<>(30);
        MyNode<Integer> myFourthNode = new MyNode<>(56);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.add(myFourthNode);
        myLinkedList.popNode(40);
        int size = myLinkedList.getSize();
        Assert.assertEquals(3, size);
    }

    // Element Added in the sorted Linked List
    @Test
    public void IfLInkedListIsInAscendingOrderReturnTrue() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.sortedLinkedList(myFirstNode);
        myLinkedList.sortedLinkedList(mySecondNode);
        myLinkedList.sortedLinkedList(myThirdNode);
        myLinkedList.sortedLinkedList(myFourthNode);
        boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.head.getNext().equals(myFourthNode)
                && myLinkedList.head.getNext().getNext().equals(myFirstNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertEquals(true, result);
    }
}