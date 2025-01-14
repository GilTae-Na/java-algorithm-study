package org.example.코테책.스택;

import java.util.Stack;

public class 스택_02 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String solution(int decimal){
        Stack<Integer> stack = new Stack<>();

        while(decimal > 0){
            int result = decimal % 2;
            stack.push(result);
            decimal /=2;
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
