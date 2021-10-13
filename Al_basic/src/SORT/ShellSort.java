package SORT;
/*
셸 정렬의 장점 및 단점

[장점]
1. 멀리 있는 원소들끼리 빠르게 비교 및 교환이 이루어진다.
2. 삽입정렬(Insertion Sort), 거품정렬(Bubble Sort)에 비해 정렬 속도가 빠르다.
[단점]

1. 일반적인 삽입정렬에 비해 구현이 까다롭다.
2. gap sequence에 영향을 많이 받으며 적절한 시퀀스를 선택해야 한다. 
3. 일정 간격을 두고 원소의 교환이 이루어지기 때문에 안정정렬이 아니다.
*/
public class ShellSort {
    private final static int[] gap = 
		{ 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937, 	
		8858, 19930, 44842, 100894, 227011, 510774,
		1149241, 2585792, 5818032, 13090572, 29453787, 
		66271020, 149109795, 335497038, 754868335, 1698453753};	// 갭을 담고있는 배열	
    
    public static void shell_sort(int[] a){
        shell_sort(a, a.length);
    }

    private static int getGap(int length){
        int index = 0 ;
        // 최소한 부분 배열의 원소가 2개씩은 비교 되도록 나눠준다.
        int len =(int)(length / 2.25); 
        while(gap[index] <= len){
            index++;
        }
        return index;
    }

    private static void shell_sort(int[] a , int size){
        int index = getGap(size); //  첫 gap을 사용할 index
        // gap[index] 값부터 gap [0] 까지 반복한다.
        for (int i = index; i>=0 ; i--){
            for(int j = 0; j<gap[i] ; j++){ // 각 부분 리스트에 대해 삽입정렬을 한다.
                insertion_sort(a, i , size , gap[i]);
            }
        }
    }
    private static void insertion_sort(int[] a, int start, int size, int gap) {
 
		// 부분 배열의 두 번째 원소부터 size까지 반복한다. (gap 값씩 건너띔) 
		for (int i = start + gap; i < size; i += gap) {
 
			int target = a[i];
			int j = i - gap;
 
			// 타겟 원소가 이전의 원소보다 작을 때 까지 반복 
			while (j >= start && target < a[j]) {
				a[j + gap] = a[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
				j -= gap;
			}
			/*
			 * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
			 * 타겟 원소는 j번째 원소 뒤에 와야한다.
			 * 그러므로 타겟은 j + gap 에 위치하게 된다.
			 */
			a[j + gap] = target;
 
		}
	}
    public static void main(String[] args) {
        int[] arr = {8, 1, 4, 2, 7, 6, 3, 5};
        int N = arr.length;
        
        for(int h = N / 2; h > 0; h /= 2) {           //간격
            for(int i = h; i < N; i++) {            //삽입 정렬을 하기 위해 부분 배열의 두 번째 값을 가지고 값을 비교한다.
                int j;
                int temp = arr[i];                    //ex 간격이 4이면 처음 arr[i]는 7이다. 7 ~ 5까지 삽입 정렬 시작
                
                for(j = i - h; j >= 0 && arr[j] > temp; j -= h) {  //부분 배열끼리 연산하도록 j = i - h 
                    arr[j + h] = arr[j];                           //삽입 정렬을 위해 한칸 씩 미뤄준다.
                }
                arr[j + h] = temp;                                   //조건문을 빠져나온 j는 이미 j-h연산이 끝났으므로 다시 +h를 해준다.
            }
        }
        
        for(int a : arr) {
            System.out.print(a +" ");
        }
    }
 




}
