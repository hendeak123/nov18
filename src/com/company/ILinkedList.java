package com.company;

public interface ILinkedList<T> {
    void initializeList(T data, int id);
    void append(T data, int id);
    INode<T> getHead();
    INode<T> findNode(int id);
    void removeNode(int id);
}
