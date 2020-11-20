package com.company;

class Node<T> implements INode<T> {
    private T data;
    private INode<T> next;
    private int id;

    Node(T data, int id) {
        this.data = data;
        this.id = id;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public T setData(T data) {
        this.data = data;
        return data;
    }

    @Override
    public int getId() {
        return id;
    }

    public INode<T> getNext() {
        return next;
    }

    public INode<T> setNext(INode<T> node) {
        this.next = node;
        return node;
    }

    public String toString() {
        return this.id + " " + this.data;
    }
}
