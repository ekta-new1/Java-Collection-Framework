package Stacks;
import java.util.Stack;

//In apps like text editors (Notepad, Word):
//You type something → saved in stack
//Press Undo → last action removed

public class RealLifeExample {
        public static void main(String[] args) {
            Stack<String> stack = new Stack<>();  //10

            // User typing
            stack.push("H");
            stack.push("He");
            stack.push("Hel");
            stack.push("Hell");
            stack.push("Hello");   //[H, He,,....]
            System.out.println("Current: " + stack.peek());  //top element
            // Undo operation
            stack.pop();

            System.out.println("After Undo: " + stack.peek());   //hell
        }
}
