package org.example.자료구조.배열;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world! -- 22222");
    }

    public int[] solution(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public int[] solution2(int[] arr){ //원본배열 복사해서 사용,
        Arrays.sort(arr);
        return arr;


    }

    //.sort() = O(nlogn)
}
