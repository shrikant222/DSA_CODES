package Stack_Queue.StackANDQueue;

import java.util.Stack;

class MyQueue {
    Stack<Integer> A ;
    Stack<Integer> B ;

    public MyQueue() {
    this.A = new Stack<>();
    this.B = new Stack<>();
    }

    public void push(int x) {
        A.push(x);
    }

    public int pop() {
    int one=-1;
    if(A.empty())return -1;
    else{
        while(!A.empty()){
            B.push(A.pop());
        }
        one=B.pop();

    while(!B.empty()){
        A.push(B.pop());
    }
    return one;}
    }

    public int peek() {
        int one=-1;
    if(A.empty())return -1;
    else{
        for(int i = A.size() - 1; i >= 0; i--){
            B.push(A.pop());
        }
        one=B.peek();
        for(int i = B.size() - 1; i >= 0; i--){
            A.push(B.pop());
        }
        return one;

    }
    }

    public boolean empty() {
    return A.empty() && B.empty();
    }


    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
       myQueue.peek();
       myQueue.pop();
        System.out.println(myQueue.empty());


    }





}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
