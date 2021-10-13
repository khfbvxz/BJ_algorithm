package SORT;

import java.util.Arrays;

/*
퀵 정렬
가장 많이 사용되는 정렬
기준을 설정한 다음 큰 수와 작은 수를 교환한 후 리스트를 반으로 나누는 방식   이러한 교환을 위한 기준 피벗!!!!
퀵정렬을 수행 하기 전 피벗을 어떨게 설정할 것인지 미리 명시해야함

피벗을 설정 하고 리스트를 분할 하는 방법 여러가지
대표적 호어(Hoare) 분할 방식
    리스트에서 첫번째 데이터를 피벗으로 정한다.는 규칙으로 피벗 설정
    왼쪽부터 피벗보다 큰 데이터를 찾고 오른쪽부터 피벗보다 작은 데이터를 찾는다. 그다음 큰 데이터와 작은데이터의 위치 교환
    이 반복하면 피벗에 대한 정렬 수행
특징
    퀵 정렬에서는 이처럼 특정한 리스트에서 피벗을 설정하여 정렬을 수행한 이후에 피벗을 기준으로 왼쪽리스트와 오른쪽 리스트에서 각각 다시 정렬 수행
    재귀함수와 동작원리 같다. 


*/
public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {5, 13, 32, 25, 2, 42, 18, 29, 36, 1};
        System.out.println(Arrays.toString(arr)+"원본배열");
        QuickSortMax(arr, 0, arr.length-1);
        for(int i : arr){
            System.out.print(i+"  ");
        }
    }
    public static void QuickSortMax(int []arr , int start, int end){
        if(start>=end) // 원소가 한개인 경우
            return;
        int pivot = start; //피벗은 첫번째 원소
        int left = start+1;
        int right = end;

        while(left <= right){
            // 피벗 보다 큰 데이터를 찾을때까지 반복
            while( left <= end && arr[left] <= arr[pivot]){
                left+=1;
            }
            // 피벗보다 작은 데이터를 찾을 떄 까지 반복
            while( right > start && arr[right] >= arr[pivot] ){
                right-=1;
            }
            if(left > right){ // 엇갈렸다면 작은 데이터와 피벅을 교체
                int tmp = arr[right];
                arr[right] = arr[pivot];
                arr[pivot] = tmp;
            }else{ // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
                int tmp = arr[right];
                arr[right] = arr[left];
                arr[left] = tmp;
            }
            System.out.println(Arrays.toString(arr));
            // 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행
            QuickSortMax(arr, start, right-1);
            QuickSortMax(arr, right+1, end);

        }
    }
}
