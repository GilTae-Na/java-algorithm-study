package org.example.코테책.트리;

//루트노드, 노드 , 간선(엣지), 형제노드, 부모-자식 노드 리프노드(마지막노드) 각각 레벨이 있음
//배열, 포인터로 만들수 있다.

//배열로 만들기 (메모리 많이 듬 , 나쁜방법은 아님)
//루트노드는 인덱스 1 (0 으로 해도 되는데 1이 계산이 쉬움)
//왼쪽자식은 부모노드 배열인덱스 x 2
//오른쪽 자식은 부모노드 배열인덱스 x 2 + 1

//순회 ( '현재 노드' 를 부모노드로 생각했을때)
//전위(부모 -> 왼-> 오) (트리 복사할때 많이 씀)
//중위(왼 -> 부모 -> 오) (탐색(지나가기)이 있고  방문(확인)  있음)(정렬된 순서대로 값을 가져올때 사용)
//후위(왼-> 오-> 부노) (삭제에 많이 사용)

//포인터로 만들기
//이진트리 탐색하기
//데이터 크기를 따져 크기가 작으면 왼쪽, 크면 오른쪽자식

//현제노드보다 크면 오른쪽 작으면 왼쪽
//배열탐색보다 빠름

//다만 균형이 맞아야 하니 균형이진트리로 만들어보자



public class 트리 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String[] solution(String[] strArr){
        String[] result = new String[3];
        result[0] = preorder(strArr, 0).trim();
        result[1] = inorder(strArr, 0).trim();
        result[2] = postorder(strArr, 0).trim();

        return result;
    }

    public String preorder(String[] arr, int idx){
        if(idx >= arr.length){
            return "";
        }

        return arr[idx] + " " + preorder(arr, idx * 2 + 1) + preorder(arr, idx * 2 + 2);
    }

    public String inorder(String[] arr, int idx){
        if(idx >= arr.length){
            return "";
        }

        return inorder(arr, idx * 2 + 1) + arr[idx] + " " +  inorder(arr, idx * 2 + 2);
    }

    public String postorder(String[] arr, int idx){
        if(idx >= arr.length){
            return "";
        }

        return postorder(arr, idx * 2 + 1) + postorder(arr, idx * 2 + 2) + arr[idx] + " " ;
    }
}
