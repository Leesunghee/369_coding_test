package com.company;

public class Child extends Parent {

    @Override
    public void addAll() {
        System.out.println("Child.addAll");
        super.addAll();
    }

    @Override
    public void add() {
        System.out.println("Child.add");
//        super.add();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.addAll();

        System.out.println("========================");
        Parent parent = new Child();
        parent.addAll();

        System.out.println("========================");
        parent = new Parent();
        parent.addAll();
    }
}
