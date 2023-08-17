package StackANDQueue;

import java.util.Stack;

public class InBuitStack {

    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.elementAt(2));
        for (int i = 0; i < stack.elementAt(2) ; i++) {

            System.out.println( stack.get(i));

        }

        stack.pop();
        stack.pop();
        stack.pop();
      
       

        System.out.println(stack.empty());

    }
}
