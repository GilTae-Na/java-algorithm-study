package org.example.코테책.스택;

//스택
//push, pop, isfull, isEmpty, top(최근 저장한 데이터의 위치, 초기값은 -1{top이 0이면 데이터가 1개})

//push
//1. isFull로 데이터 찼는지 확인
//2. top 1만큼 증가, top위치에 (data[0])에 추가

//pop
//isEmpty로 비었는지 확인
//top-1, 그 위치에 있는 데이터 빼기

//peek 반환하진 않고 그냥 데이터만 반환

//문제 : 괄호 짝 맞추기 문제
// '가장 가까운(최근)' 괄호와 상쇄된다 -> 스택을 떠올리자

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class 스택_01 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //내가 만든것
    public boolean solution(String s){
        Stack stack = new Stack();
        String [] stringArray = s.split("");
        for(String str: stringArray){
            if(s.equals("(")){
                stack.push(str);
            }else{
                stack.pop();
            }
        }

        return stack.empty() ? true : false;

    }

    //책 답지
    public boolean solution2(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] a =  s.toCharArray();

        for(char c :a){
            if(c == '('){
             stack.push(c);
            }else{

                if(stack.isEmpty() || stack.pop() == 'c'){
                    //스택이 비어있을때 pop하면 EmptyStackException 나옴
                    stack.pop();
                }

            }
        }

        return stack.isEmpty();
    }



}
