package com.company.datastructure;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {

    private List<T> stack = new ArrayList<>();

    public void push(T item) {
        this.stack.add(item);
    }

    public T pop() {
        if (!isEmpty()) {
            return this.stack.remove(this.stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
