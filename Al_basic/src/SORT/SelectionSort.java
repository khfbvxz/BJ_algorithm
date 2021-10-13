package SORT;

import java.util.Arrays;

/* 선택 정렬
각 루프마다 최대 원소를 찾는다. 
최대 원소와 맨 오른쪽 원소를 교환
맨 오른쪽 원소를 제외한다.
하나의 원소만 남을때까지 위의 루프를 반복한다.

*/
public class SelectionSort {
    private static int[] input = {15, 6, 52, 7, 19, 23, 4, 1};
    public static void main(String[] args) {
        
        SelectionSortMax(input, input.length);  //  오름차순
        // for(int a : input){
        //     System.out.print(a + " ");
        // }
        SelectionSortMin(input, input.length); // 내림차순
        for(int a : input){
            System.out.print(a + " ");
        }

    }// main end

    private static void SelectionSortMax(int [] input, int length){
        System.out.println(Arrays.toString(input)+"원래 배열");
        int max;
        int tmp;
        //{5, 6, 2, 8, 7, 23, 4, 1};
        for (int i = length -1; i>0 ; i--){
            max=i; // 7 6 5 4 3 2 1 0 
            for(int j = i-1 ; j>=0; j--){
                // 6 5 4 3 2 1 0 
                if(input[j]>input[max])
                    max=j;
            }
            tmp = input[i];
            input[i]=input[max];
            input[max]=tmp;
            System.out.print(tmp + "  "+ input[i]+ "  "+ input[max]+"\n");
            System.out.println(Arrays.toString(input));
        }// end for
    }// end Max

    public static void SelectionSortMin(int[] input, int length){
        System.out.println(Arrays.toString(input)+"원래 배열");
        int min;
        int tmp;
        for(int i = 0 ; i<length ; i++){
            min = i;
            for(int j = i +1; j<length ; j++){
                if(input[j]<input[min])
                    min =j;
            }
            tmp = input[min];
            input[min]= input[i];
            input[i]=tmp;
            System.out.print(tmp + "  "+ input[min]+ "  "+ input[i]+"\n");
            System.out.println(Arrays.toString(input));
        }
    }
}
