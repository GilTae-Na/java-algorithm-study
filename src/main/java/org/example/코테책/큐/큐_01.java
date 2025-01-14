package org.example.코테책.큐;

//큐 = FIFO
//isfull, isEmpty, add (rear + 1), poll (front + 1)
//front(가장 마지막에 poll 한 위치 기억)
//rear (가장 마지막 add한 위치 기억)

//선형큐도 있는데 자바 Queue로 충분
//add연산은 offer로 가능, but 호출이 1번 더 많음

// Deque = 양끝에서 삽입, 삭제 가능
///pollFirst(), addLast() 만 사용하면 Queue로 사용가능
//addFirst(), pollFirst() 만 사용하면 Stack으로 사용 가능
//Deque는 3개 다 구현 가능임

import java.util.ArrayDeque;

public class 큐_01 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int solution(int n, int k){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i=1; i<=n; i++){
            deque.addLast(i);
        }

        while(deque.size() > 1){
            for(int i=0 ;i<k-1; i++){
                deque.addLast(deque.pollFirst());
            }
            deque.pollFirst();
        }

        return deque.pollFirst();

    }


}
