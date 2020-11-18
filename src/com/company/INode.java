package com.company;

public interface INode<T> {
    T getData();

    T setData(T data);

    int getId();

    INode<T> getNext();

    INode<T> setNext(INode<T> node);
}
