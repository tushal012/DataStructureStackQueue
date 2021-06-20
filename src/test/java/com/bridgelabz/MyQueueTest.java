package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    @Test
    public void given3IntegersWhenAddedToQueueShouldPassTheTest(){
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        INode peak = myQueue.peak();
        myQueue.printQueue();
        Assertions.assertEquals(peak, myFirstNode);
    }
}
