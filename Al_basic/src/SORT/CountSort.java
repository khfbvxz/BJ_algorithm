package SORT;

// import java.util.Arrays;

/*
계수정렬은 특정한 조건이 부합할 때만 사용할 수 있는 매우 빠른 정렬 알고리즘
모든데이터가 양의 정수인 상황에서 데이터의 개수가 N 데이터 중 최댓값이 K일때 ,
계수정렬은 최악의 경우에고 수행시간 O(N+K)

하지만 계수정렬은 데이터의 크기 범위가 제한 정수형태로 표현 할 수 있을 때만 사용 (실수형 데이터에는 사용할 수 XXX)
일반적으로 데이터의 최소 , 최대의 차가 1,000,000 을 넘지 않을 때 효과적


*/
public class CountSort {
    public static void main(String[] args) {
        // // 모든 원소의 값이 0보다 크거나 같다고 가정
        // int arr[] = {7, 5 , 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        // // 모든 범위를 포함하는 리스트 선언 (모든 값은 0 으로 초기화 , int 는 기본적으로 0으로 초기화)
        // int []count = new int [arr.length];

        // for(int i = 0 ; i<count.length ; i++){
        //     count[arr[i]] += 1; // 각 데이터에 해당하는 인덱스의 값 증가
        // }
        // System.out.println(Arrays.toString(count));
        // for(int i = 0 ; i < count.length ; i++){ // 배열에 기록된 정렬 정보 확인
        //     for(int j = 0 ; j < count[i] ; j++){
        //         System.out.printf("%d ", i);// 동작한 횟수만큼 인덱스 출력
        //     }
        // }
        int[] array = new int[100];		// 수열의 원소 : 100개
		int[] counting = new int[31];	// 수의 범위 : 0 ~ 30
		int[] result = new int[100];	// 정렬 될 배열 
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*31);	// 0 ~ 30
		}
 
		
		// Counting Sort
		// 과정 1 
		for(int i = 0; i < array.length; i++) {
			// array 의 value 값을 index 로 하는 counting 배열 값 1 증가 
			counting[array[i]]++;			
		}
		
		// 과정 2 
		for(int i = 1; i < counting.length; i++) {
			// 누적 합 해주기 
			counting[i] += counting[i - 1];
		}
		
		// 과정 3
		for(int i = array.length - 1; i >= 0; i--) {
			/*
			 *  i 번쨰 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤 
			 *  counting 배열의 값을 인덱스로 하여 result에 value 값을 저장한다.
			 */
			int value = array[i];
			counting[value]--;
			result[counting[value]] = value;
		}
		
		
		
		/* 비교 출력 */
		
		// 초기 배열 
		System.out.println("array[]");
		for(int i = 0; i < array.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n\n");
		
		
		// Counting 배열 
		System.out.println("counting[]");
		for(int i = 0; i < counting.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(counting[i] + "\t");
		}
		System.out.println("\n\n");
		
		
		// 정렬된 배열
		System.out.println("result[]");
		for(int i = 0; i < result.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(result[i] + "\t");
		}
		System.out.println();

    }
}
