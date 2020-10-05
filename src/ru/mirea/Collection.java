package ru.mirea;

import java.util.ArrayList;
import java.util.List;

public class Collection<E> {

    private List list;

    public Collection() {
        list=new ArrayList<>();
    }

    public void showList() {
        for (Object ls : list) {
            System.out.print(ls + " ");
        }
        System.out.println();
    }

    public void add(Object element) {
        list.add(element);
    }

    public void addArray(E [] t){
        for (E g: t
             ) {
            add((Object) g);
        }
    }

    public Object get(int i){
        if(i>=list.size()) return null;
        return list.get(i);
    }

    public List getList() {
        return list;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "list=" + list +
                '}';
    }
}