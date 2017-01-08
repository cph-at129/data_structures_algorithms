package com.doubleLinkedList;

/**
 * Created by monster on 1/8/2017.
 */
public class DoubleLinkedListDemo<T> {
    private Node<T> first;
    private Node<T> last;

    public Node<T> addLast(T value){
        Node<T> node = new Node<T>(value);
        if(this.first == null){
            this.first = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
        return node;
    }
    public Node<T> addFirst(T value){
        Node<T> node = new Node<T>(value);
        if(this.first == null){
            this.first = node;
            this.last = node;
        }else {
            node.next = this.first;
            this.first.prev = node;
            this.first = node;
        }
        return node;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

}
