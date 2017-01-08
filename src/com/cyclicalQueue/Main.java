package com.cyclicalQueue;

/**
 * Created by monster on 1/8/2017.
 */
public class Main {
    public static void main(String[] args) {
        CyclicalQueueDemo myQueue = new CyclicalQueueDemo<Integer>();
        myQueue.engueue(1);
        myQueue.engueue(2);
        myQueue.engueue(3);
        myQueue.engueue(4);
        myQueue.engueue(5);

        System.out.println(myQueue.degueue());
        System.out.println(myQueue.degueue());
        System.out.println(myQueue.degueue());

        myQueue.engueue(6);
        myQueue.engueue(7);
    }
}
