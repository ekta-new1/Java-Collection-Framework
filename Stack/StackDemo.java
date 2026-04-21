package Stacks;
import java.util.Stack;
//A Stack is a linear data structure that follows the principle of:
//LIFO (Last In, First Out)
//This means the last element added is the first one to be removed.
//Real-Life Example
//Think of a stack of plates in your mess:
//You place plates one on top of another.
//The last plate you put is the first one you take out.
public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        System.out.println("Is stack empty? " + stack.isEmpty());   //true

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after pushes: " + stack);

        System.out.println("Top element (peek): " + stack.peek());   //top element - 40

        System.out.println("Position of 20: " + stack.search(20)); //returns position from top(1)

        System.out.println("Size of stack: " + stack.size());  //total elements - 4

        System.out.println("Popped element: " + stack.pop());  //removes element from top
        System.out.println("Stack after pop: " + stack);  //[10,20,30]

        System.out.println("Iterating stack:");
        for (Integer num : stack) {
            System.out.println(num);
        }

        System.out.println("Does stack contain 10? " + stack.contains(10));  //true

        stack.clear();  //removes all the element []
        System.out.println("Stack after clear: " + stack);

        System.out.println("Is stack empty now? " + stack.isEmpty());  //true
    }
}