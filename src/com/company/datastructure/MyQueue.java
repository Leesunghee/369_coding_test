package com.company.datastructure;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<T> {

    private List<T> queue = new ArrayList<>();

    public void enqueue(T item) {
        this.queue.add(item);
    }

    public T dequeue() {
        if (!isEmpty()) {
            return this.queue.remove(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
    }
}
