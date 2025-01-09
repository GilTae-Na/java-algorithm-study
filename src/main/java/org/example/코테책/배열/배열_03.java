package org.example.코테책.배열;

import java.sql.Array;
import java.util.HashSet;

//정수배열 numbers에서 서로 다른 인덱스에 있는 2개의 수를 뽑아 더 해
//만들 수 있는 모든 수를 배열에 오름차순으로 담아 반환하는 함수 만드시오

//프로그래머스 66644
public class 배열_03 {

    public static void main(String[] args){
        int[] addIntArr = new int[]{2,15,4,13,6,8};
        solution(addIntArr);
    }

    public static int[] solution(int[] intArray){
        HashSet<Integer> set = new HashSet<>(); // hashSet공부
        for(int i=0; i<intArray.length; i++){
            for(int j=0; j<intArray.length; j++){
                set.add(intArray[i] + intArray[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

}