package com.cyclicalQueue;

import java.util.ArrayList;

/**
 * Created by monster on 1/8/2017.
 */
public class CyclicalQueueDemo<T> {
    private final int ARRAY_LENGTH = 8;
    private ArrayList<T> queue;
    private int head;
    private int tail;

    public CyclicalQueueDemo() {
        this.queue = new ArrayList<T>(ARRAY_LENGTH);
        this.head = 0;
        this.tail = 0;
    }

    public void engueue(T value){
        this.queue.add(this.tail, value);
        this.tail++;
        if(this.tail >= this.queue.size() && this.head > 0){
            this.tail = 0;
        }
        if(this.tail == this.head){
            this.increaseCapacity();
        }
    }

    public T degueue(){
        T result = this.queue.get(this.head);
        this.head++;

        if(this.head >= this.queue.size()){
            this.head = 0;
        }
        if(this.head == this.tail){
            result = null;
        }
        return result;
    }

    private void increaseCapacity() {
    }


}
