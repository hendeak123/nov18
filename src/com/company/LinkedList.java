package com.company;

public class LinkedList<T> implements ILinkedList<T> {
    private INode<T> head;

    public void initializeList(T data, int id) {
        if (head == null) {
            head = new Node(data, id);
        }
    }

    public void append(T data, int id) {
        Node<T> newNode = new Node<T>(data, id);
        if (head == null) {
            head = newNode;
        }
        INode<T> currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    public INode<T> getHead() {
        return this.head;
    }

    public INode<T> findNode(int id) {
        if (head == null) {
            return null;
        }
        INode<T> currentNode = head;
        while (currentNode.getNext() != null && currentNode.getId() != id) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public void removeNode(int id) {
        if (head == null) {
            return;
        }
        INode<T> currentNode = head;
        INode<T> previousNode = null;
        INode<T> nextNode = null;
        while (currentNode.getNext() != null && currentNode.getId() != id) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            nextNode = currentNode.getNext();
        }
        if (nextNode != null) {
            previousNode.setNext(nextNode);
        }
        currentNode.setNext(null);
        currentNode = null;
    }
}
