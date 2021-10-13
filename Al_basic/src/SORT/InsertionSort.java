package SORT;

/* 삽입정렬
맨 처음 인덱스에 있는 원소를 정렬되어있는 상태라고 보고, 
두번째 인덱스에 있는 데이터를 이 정렬된 배열에 삽입하면서, 두개의 데이터가 다시 정렬된 상태가 되도록 만드는 정렬 방법이다. 반복적으로.

삽입정렬은 데이터를 하나씩 확인하며, 각 데이터를 적절한 위치에 삽입
선택정렬에 비래 실행시간 측면 더 효율적 , 필요할 때만 위치를 바꾸므로 데이터가 거의 정렬되어 있을 때 더욱 효과적 
특징
삽입 정렬이 이루어진 원소는 항상 오름차순을 유지하는 특징이 있다.  
*/
import java.util.Arrays;
public class InsertionSort {
    private static int[] input = {15, 6, 52, 37, 19, 23, 4, 1};
    public static void main(String[] args) {
        InsertionSortMax(input, input.length);
        InsertionSortMin(input, input.length);
        for(int a : input){
            System.out.print(a + "  ");
        }
    }

    private static void InsertionSortMax(int [] input,int length){
        System.out.println(Arrays.toString(input)+"원래 배열");
        int tmp;
        for(int i = 1 ; i<length ; i++){
             for(int j =i ; j>0 ;j--){
                 if(input[j-1]>input[j]){
                    //  tmp = input[j-1];
                    //  input[j-1]=input[j];
                    //  input[j]=tmp;
                    tmp = input[j];
                    input[j]=input[j-1];
                    input[j-1]=tmp;
                 }
             }
            //  System.out.print(tmp + "  "+ input[min]+ "  "+ input[i]+"\n");
            System.out.println(Arrays.toString(input));
        }
        
    }
    private static void InsertionSortMin(int [] input,int length){
        System.out.println(Arrays.toString(input)+"원래 배열");
        int tmp;
        for(int i = 1 ; i<length ; i++){
             for(int j =i ; j>0 ;j--){
                 if(input[j-1]<input[j]){
                    //  tmp = input[j-1];
                    //  input[j-1]=input[j];
                    //  input[j]=tmp;
                    tmp = input[j];
                    input[j]=input[j-1];
                    input[j-1]=tmp;
                 }
             }
            //  System.out.print(tmp + "  "+ input[min]+ "  "+ input[i]+"\n");
            System.out.println(Arrays.toString(input));
        }
    }
    
}
