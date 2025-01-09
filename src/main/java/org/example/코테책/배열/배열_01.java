package org.example.코테책.배열;

import java.util.Arrays;

// 입력받은 배열을 정렬하여 반환하라

public class 배열_01 {

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
