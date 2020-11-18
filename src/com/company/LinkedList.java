package com.company;

public class LinkedList<T> implements ILinkedList<T> {
    private INode<T> head;

    public void initializeList(T data, int id) {
        if (head == null) {
            head = new Node(data, id);
        }
    }
}
