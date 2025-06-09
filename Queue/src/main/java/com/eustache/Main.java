package com.eustache;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        * Queue: FIFO data structure: First-In First-Out
        * A Collection designed for holding elements prior to processing linear data structure
        */

        Queue<String> queue = new LinkedList<>();
        queue.offer("Catherine");
        queue.offer("Donald");
        queue.offer("Jack");
        queue.offer("Mary");

        System.out.println(queue);

        /*
         * Priority Queue = A FIFO data structure that serves elements
         * with the highest priorities first before elements
         * with lower priority
         */
        Queue<Double> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue1.offer(4.0);
        queue1.offer(5.0);
        queue1.offer(6.0);
        queue1.offer(1.5);
        queue1.offer(2.5);

        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }
        /*
         * Where are queues useful?
         * 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed )
         * 2. Printer Queue ( Print jobs should be complicated in order )
         * 3. Used in LinkendLists, PriorityQueues, Breadth-first search
         */
    }
}