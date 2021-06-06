package com.company.datastructure;

public class DoubleLinkedList<T> {

    private Node<T> head = null;
    private Node<T> tail = null;

    class Node<T> {
        private T data;
        private Node<T> prev = null;
        private Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (this.head == null) {
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> searchFromHead(T isData) {
        if (this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    return node;
                }
                node = node.next;
            }
        }
        return null;
    }

    public Node<T> searchFromTail(T isData) {
        if (this.tail != null) {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node;
                }
                node = node.prev;
            }
        }
        return null;
    }

    public boolean insertToFront(T existedData, T addData) {
        if (this.head == null) {
            addNode(addData);
        } else if (this.head.data == existedData) {
            Node<T> newHead = new Node<>(addData);
            newHead.next = this.head;
            this.head.prev = newHead;
            this.head = newHead;
            return true;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == existedData) {
                    Node<T> nodePrev = node.prev;
                    nodePrev.next = new Node<>(addData);
                    nodePrev.next.next = node;
                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.next;
                    return true;
                } else {
                    node = node.next;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.addNode(1);
        doubleLinkedList.addNode(2);
        doubleLinkedList.addNode(3);
        doubleLinkedList.addNode(4);
        doubleLinkedList.addNode(5);
        doubleLinkedList.printAll();
        System.out.println("----------------");

        doubleLinkedList.insertToFront(3, 2);
        doubleLinkedList.printAll();
        System.out.println("----------------");

        doubleLinkedList.insertToFront(6, 2);
        doubleLinkedList.insertToFront(1, 0);
        doubleLinkedList.printAll();
        System.out.println("----------------");

        doubleLinkedList.addNode(6);
        doubleLinkedList.printAll();
    }
}
