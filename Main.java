package com.company;

public class Main {

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(12);
        myList.add(15);
        myList.add(2);
        myList.add(9);
        myList.add(1);
        myList.add(19);
        System.out.println(myList.toString());
        myList.swap(0,3);
        System.out.println(myList.toString());
        myList.sort();
        System.out.println(myList.toString());
    }
}