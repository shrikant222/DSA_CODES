package Stack_Queue;

import java.util.Stack;
class Solution {
    Stack<Character> a=new Stack<>();
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                a.push(c);
            }
            else{
                if(c==')'){
                    if(a.isEmpty() || a.pop() != '(') return false;
                };
                if(c==']'){
                    if(a.isEmpty() || a.pop() != '[') return false;
                };
                if(c=='}'){
                    if(a.isEmpty() || a.pop() != '{') return false;
                };
            }
        }
        return a.isEmpty();
    }
}