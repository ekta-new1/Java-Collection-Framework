package Stacks;

import java.util.Stack;
//create a stack
// ({[]}) true because all the opening brackets have closing brackets
public class ValidParentheses {

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (char ch : s.toCharArray()) {   //    (,{,[,],},)
                // we will push, if the brackets are opening
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);     // (,{,[
                }
                // we will pop if brackets are closing
                else {
                    // If stack is empty → invalid
                    if (stack.isEmpty()) return false;

                    char top = stack.pop();   // [

                    // Check matching
                    if ((ch == ')' && top != '(') ||
                            (ch == '}' && top != '{') ||
                            (ch == ']' && top != '[')) {
                        return false;
                    }
                }
            }

            // Stack should be empty for valid string
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String input = "({[]})";
            System.out.println(isValid(input)); // true
        }
    }

