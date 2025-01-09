package org.example.코테책.배열;

import java.util.Arrays;
import java.util.Collections;

//입력받은 정수 배열을 중복을 제거하고 내림차순으로 정렬하는 함수 작성
public class 배열_02 {

    public static void main(String[] args) {

        System.out.println("Hello world! -- 22222");
    }

    public int[] solution(int[] intArray){
        Integer[] resultArray = Arrays.stream(intArray).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(resultArray, Collections.reverseOrder());
        return Arrays.stream(resultArray).mapToInt(Integer::intValue).toArray();
    }
}
