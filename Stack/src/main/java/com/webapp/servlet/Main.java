package com.webapp.servlet;

import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        /*
        * Stack: LIFO data structure: Last-In First-Out
        * Stores objects into a sort of 'vertical lower'
        * push() to add to the top
        * pop() to remove from the top
        */

        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("Java");
        stack.push("Python");
        stack.push("PHP");

        for (int i = 0; i < 5; i++) {
            stack.push("Java");
        }
        System.out.println(stack);

        /* Uses of stacks ?
         *  1. undo/redo features in text editors
         *  2. moving back/forward through browser history
         *  3. backtracking algorithms (maze, file directories)
         *  4. calling functions (call stack)
         */
    }
}