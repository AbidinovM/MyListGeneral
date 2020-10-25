package com.company;

public class MyList {
    class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public boolean hasNext() {
            return (this.next != null ? true : false);
        }
    }

    Node begin;
    long length;

    public myList() {
        this.begin = null;
        this.length = 0;
    }

    public void add(int value) {
        if (begin == null) {
            this.begin = new Node(value);
        } else {
            this.end().setNext(new Node(value));
        }
        this.length++;
    }

    public Node end() {
        if (this.begin == null)
            return null;

        Node iter = this.begin;
        while (iter != null) {
            iter = iter.getNext();
        }
        return iter;
    }

    public String toString() {
        String result = "[ ";
        if (this.begin != null) {
            Node iter = this.begin;
            while (iter != null) {
                result += iter.toString() + ", ";
                iter = iter.getNext();
            }
            result += iter.toString() + " ";
        }
        result += " ]";
    }

    public void Swap(int firstPos, int secondPos ) {
        Node iter;
        iter = indexAt(firstpos);
        int a = iter.getValue();
        iter = indexAt(secondpos);
        int b = iter.getValue();
        iter = indexAt(firstpos);
        iter.setValue(b);
        iter = indexAt(secondpos);
        iter.setValue(a);
    }
    public Node indexAt (int index) {
        Node iter = this.begin;
        int i = 0;
        if ((index < this.length) && (index >= 0)) {
            while (i < index) {
                iter = iter.getNext();
                i++;
            }
        }
        return iter;
    }
    public void sort() {
        Node iter;
        int min;
        int k;
        for (int i = 0; i < this.length; ++i) {
            k = i;
            iter = indexAt(i);
            min = iter.getValue();
            for (int j = i; j < this.length; ++j) {
                iter = indexAt(j);
                if (iter.getValue() < min){
                    min = iter.getValue();
                    k = j;
                }
            }
            swap(i, k);
        }
    }
}
