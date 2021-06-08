package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public static void main(String[] args) {
        InstrumentedHashSet<String> instrumentedHashSet = new InstrumentedHashSet();
        List<String> crews = Arrays.asList("test1", "test2", "test3");

        instrumentedHashSet.add("test4");
        instrumentedHashSet.addAll(crews);

        System.out.println("addCount = " + instrumentedHashSet.addCount);
    }
}
