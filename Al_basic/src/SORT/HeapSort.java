package SORT;

import java.util.Arrays;

/*
Heap Sort 는 heap 을 이용한 정렬 방식
heap 은 최대값 또는 최소값을 빠르게 찾기위해 고안된 완전 이진트리를 기본으로 한 자료구조
heap 종류에는 최대힙 과 최소힙이 있습니다. 
최대힙 
    부모노드의 값이 자식노드의 값보다 항상 큰 힙
최소힙
    부모노드의 값이 자식노드의 값보다 항상 작은 힙

로직
최대힙이나 최소힙을 구성하여 정렬을 하는 방법
    정렬해야할 n 개의 데이터를 최대 힙 또는 최소 힙으로 구성
    힙의 root 노드에서 값을 순서대로 추출한다.
        root 노드의 값을 heap 을 구성하는 마지막 노드와 교환한 뒤 힙의 크기를 1만큼 줄이는 방식
*/
public class HeapSort {
    public static void main(String[] args) {
        // 정렬 되지 않은 배열
        int [] arr = {  5, 8, 4, 7, 10, 9, 2, 1, 6,3};
        System.out.println(Arrays.toString(arr));
        /*
        최대 힙 만들기 
        부모노드의 값이 자식노드의 값들보다 큰 형태                     arr.length/2-1  부모노드의 인덱스를 기준으로 왼쪽 (i*2+1) 오른쪽 (i*2+2)
        i의 초기값은 배열의 제일 끝 자식노드의 부모노드부터 시작한다.    즉 자식노드를 갖는 노트의 최대개수 부터
        */
        for(int i = arr.length/2-1 ; i>=0 ; i--){
            heapify(arr, arr.length, i); //  일반배열을 힙으로 구성?
        }

        //정렬하기
        for(int i = arr.length-1 ; i>=0 ; i--){
            swap(arr, i, 0);
            heapify(arr, i-1, 0);
        }
        //출력
        for (int i = 0 ; i <arr.length ; i++){
            System.out.print(arr[i]+ "  ");
        }
    }//main end

    public static void heapify(int[] arr,  int size , int pNode){
        int parent = pNode;        // 부모 노드
        int LNode = pNode * 2 + 1; // 왼쪽 자식 노드
        int RNode = pNode * 2 + 2; // 오른쪽 자식 노드
        // size > LNode => 인덱스 범위를 넘어서는지 확인하기 위함
        if(size > LNode && arr[parent] < arr[LNode]){ //왼쪽 자식 노드
            parent = LNode;
        }
        if(size > RNode && arr[parent] < arr[RNode]){ //오른쪽 자식 노드
            parent = RNode;
        }
        // parent에 저장된 값은 자식노드 중 큰 값이 있다면 큰 값의 인뎃스 값이 남아있을것이다.
        // 초기에 설정한 부모노드의 인덱스와 다르다면 교환을 해준다. 
        if(parent != pNode){
            swap(arr,pNode,parent);
            //* 노드와 자리를 바꾸면 최대힙 기준에 맞지 않을 수 있기 때문에 
            //* 바뀐 자식노드 아래 최대힙으로 맞추기 위함
            heapify(arr, size, parent);
            
        }
        
    }// heapify end 
    public static void swap(int [] arr , int i , int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}//class end
