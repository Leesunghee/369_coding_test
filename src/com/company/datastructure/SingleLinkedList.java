package com.company.datastructure;

public class SingleLinkedList<T> {

    private Node<T> head = null;

    class Node<T> {
        private T data;
        private Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public void addNodeInside(T data, T isData) {

        Node<T> searchedNode = search(isData);

        if (searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> node = new Node<T>(data);
            node.next = searchedNode.next;
            searchedNode.next = node;
        }
    }

    public boolean delNode(T isData) {
        if (this.head != null) {
            Node<T> node = this.head;
            if (node.data == isData) {
                this.head = this.head.next;
            } else {
                while (node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.addNode(1);
        System.out.println(singleLinkedList.head.data);
        singleLinkedList.addNode(2);
        System.out.println(singleLinkedList.head.next.data);
        singleLinkedList.printAll();
        System.out.println(singleLinkedList.search(3));
        System.out.println(singleLinkedList.search(1).data);
        singleLinkedList.addNodeInside(5, 1);
        singleLinkedList.printAll();
        singleLinkedList.delNode(5);
        singleLinkedList.printAll();
    }
}
