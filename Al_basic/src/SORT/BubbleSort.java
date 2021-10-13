package SORT;
/*
Selection Sort 는 비교한 후 각 자리를 바꾼 다 하면 
Bubble Sort 는 
0 번 인덱스 와 1번 인덱스 비교 후 자리 바꾸기

*/

import java.util.Arrays;

public class BubbleSort {
    private static int[] input = {15, 6, 52, 37, 19, 23, 4, 1};
    public static void main(String[] args) {
        bubbleSortMax(input, input.length); // 오름차순
        bubbleSortMin(input, input.length); // 내림차순
        for(int a : input){
            System.out.print(a + "  ");
        }
    }// main end

    private static void bubbleSortMax(int[] input,int length){
        System.out.println(Arrays.toString(input)+" 원래 배열");
        int tmp;
        for(int i = length-1 ; i>0 ; i--){
            for(int j = 0 ; j<i; j++){
                if(input[j]>input[j+1]){
                    tmp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=tmp;
                    // System.out.println(tmp+"  "+input[j]+"  "+input[j+1]);
                }
            }
            System.out.println(Arrays.toString(input));
        }
    }// Max end

    private static void bubbleSortMin(int[] input, int length){
        System.out.println(Arrays.toString(input)+" 원래 배열");
        int tmp;
        for(int i = length-1 ; i>0 ; i--){
            for(int j = 0 ; j<i; j++){
                if(input[j]<input[j+1]){
                    tmp = input[j];
                    input[j]=input[j+1];
                    input[j+1]=tmp;
                    // System.out.println(tmp+"  "+input[j]+"  "+input[j+1]);
                }
            }
            System.out.println(Arrays.toString(input));
        }
    }
}
