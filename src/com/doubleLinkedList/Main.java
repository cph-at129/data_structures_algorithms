package com.doubleLinkedList;

public class Main {

    public static void main(String[] args) {
	    DoubleLinkedListDemo myList = new DoubleLinkedListDemo<Integer>();
//	    myList.addLast(1);
//        myList.addLast(2);
//        myList.addLast(3);
//        myList.addLast(4);
//        myList.addLast(5);
//        myList.addLast(6);
//        myList.addLast(7);
//        myList.addLast(8);

        myList.addFirst(1);
        myList.addFirst(2);
        myList.addFirst(3);
        myList.addFirst(4);
        myList.addFirst(5);
        myList.addFirst(6);
        myList.addFirst(7);
        myList.addFirst(8);

//        System.out.println(myList.getLast().value);
//        System.out.println(myList.getLast().prev.value);
//        System.out.println(myList.getFirst().value);
//        System.out.println(myList.getFirst().next.value);
        Node targetNode = myList.getLast();
        for (int i = 0; i < 8; i++) {
            System.out.println(targetNode.value);
            targetNode = targetNode.prev;
        }
    }
}
