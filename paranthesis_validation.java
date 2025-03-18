/*
Given an expression string s, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.

Example:

Input: s = “[()]{}{[()()]()}”
Output: true
Explanation: All the brackets are well-formed


Input: s = “[(])”
Output: false
Explanation: 1 and 4 brackets are not balanced because
there is a closing ‘]’ before the closing ‘(‘


 */

import java.util.Stack;

public class paranthesis_validation {
    /*static boolean meth1(String sb){
Stack<Integer>stack =new Stack<>();
        //StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch=sb.charAt(i);
            if(ch=='('){
                stack.push(i);// index of'('
            }
            else if(ch==')'){
                if(!stack.empty()){
                    stack.pop();
                }
                else{
                    sb.setCharAt(i,'*');
                }
            }
        }
        while(!stack.isEmpty()){
            //sb.setCharAt(stack.pop(),'*');

        }
        return sb.toString().replace("*","");
    }

     */



    static boolean meth(String sb){
        Stack<Character>stack =new Stack<>();
      //  StringBuilder sb=new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch=sb.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
             }
            else{
                if(!stack.empty() && ((stack.peek()=='(' && ch==')'))
                                  || ((stack.peek()=='{' && ch=='}'))
                                  ||((stack.peek()=='[' && ch==']'))    ){
                    stack.pop();
                }
                else{
                    return false;
                }


            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="(()())";

        System.out.println( meth(s));

    }
}
