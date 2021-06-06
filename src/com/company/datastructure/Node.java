package com.company.datastructure;

public class Node <T>{
    private T data;
    private Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }
}
