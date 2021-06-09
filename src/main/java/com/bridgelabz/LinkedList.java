package com.bridgelabz;

public class LinkedList<E> {

    public INode<E> head;
    public INode<E> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode<E> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<E> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode<E> myNode) {
        if (this.head == null) {
            this.head = myNode;
        }
        if (this.tail != null) {
            this.tail.setNext(myNode);
        }
        this.tail = myNode;
    }


    public void insert(int position, INode<E> node) {
        int count = 0;
        INode<E> previousNode = null;
        INode<E> currentNode = head;
        while(count != position) {
            count++;
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        assert previousNode != null;
        previousNode.setNext(node);
        node.setNext(currentNode);
    }


    public E pop() {
        INode<E> tempNode = head.getNext();
        E key = head.getKey();
        head = tempNode;
        return key;
    }

    public E popLast() {
        INode<E> currentNode = head;
        INode<E> previousNode = null;
        while(currentNode.getNext() != null) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        E key = currentNode.getKey();
        currentNode = null;
        assert previousNode != null;
        previousNode.setNext(null);
        tail = previousNode;
        return key;
    }

    public boolean search(MyNode<Integer> item) {
        boolean isPresent = false;
        INode<E> tempNode = head;
        while(tempNode.getNext() != null) {
            if(tempNode.getKey().equals(item)) {
                isPresent = true;
            }
            else {
                tempNode = tempNode.getNext();
            }
        }
        if(tail.getKey().equals(item)) {
            isPresent = true;
        }
        return isPresent;
    }


    public void printNodes() {
        StringBuilder myNodes = new StringBuilder("My Nodes are: ");
        System.out.println("Print statement");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append((tempNode.getKey()));
        System.out.println(myNodes);
    }


}