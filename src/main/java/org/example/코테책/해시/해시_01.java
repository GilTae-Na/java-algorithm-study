package org.example.코테책.해시;

//해시  =  키, 값쌍 MAP임
//특정 데이터를 탐색하는 횟수가 많으면 해시가 좋음
//

import java.util.HashMap;
import java.util.HashSet;

public class 해시_01 {

    public static void main(String[] args) {System.out.println("Hello world!");}

    public boolean solution1(int[] arr, int target){
        HashSet<Integer> hashSet = new HashSet();

        for(int i=0; i< arr.length; i++){

            if(hashSet.contains(target - arr[i])){
                return true;
            };

            hashSet.add(arr[i]);
        }

        return false;
    }

    public String solution2(String[] participant,String[] completion){
        HashMap<String, Integer> hashmap = new HashMap<>();
        String result = "";

        for(String s: completion){
            hashmap.put(s, hashmap.getOrDefault(s, 0) +1 );
        }

        for(String s: participant){
            if(hashmap.getOrDefault(s, 0) == 0){
                return s;
            }

            hashmap.put(s, hashmap.get(s) -1);

        }
        return null;

    }

}
