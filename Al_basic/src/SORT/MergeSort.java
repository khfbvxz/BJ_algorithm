package SORT;
/*
분할 정복법
merge , quick
기본적으로 resursion 을 사용하여 문제 해ㅕㄹ
3가지 단계
    분할
        해결하고자 하는 문제를 작은 크기의 동일한 문제들로 분할
        크기는 작은 사이즈의 문제이지만 , 문제자체는 전체 문제와 동일한 문제들
    정복
        각각의 작은 문제를 순차적으로 해결
    합병
        작은 문제의 해를 합하여 원래 문제에 대한 해를 구함

합병정렬
divide           데이터가 저장된 배열을 절반으로 나눔
recursively sort 각각을 순환적으로 정렬
merge            정렬된 두 개의 배열을 합쳐 전체를 정렬
주어진 배열을 계속해서 반으로 나누다 보면 결국 길이가 1인 리스트로 쭉 나뉘어짐
길이가 1인 리스트가 된 순간 그 각각을 정렬된 리스트로 본다
이덕을 한단계씩 merge

recursive한 호출을 하기 위해서 recursion 함수를 기술할 때는, 매개변수를 명시적으로 지정하라
mergeSort(A[], p, r) {
  base case 정의; //p>=r인 경우
  if (p < r) then {
    q <- (p + q) / 2;       //p, q의 중간 지점 계산
    mergeSort(A, p, q);     //전반부 정렬
    mergeSort(A, q+1, r);   //후반부 정렬
    merge(A, p, q, r);      //합병
  }
}
​
merge(A[], p, q, r) {
  정렬되어 있는 두 배열 A[p...q]와 A[q+1...r]을 합하여
  정렬된 하나의 배열A[p...r]을 만든다.
}


출처: https://ict-nroo.tistory.com/53?category=698685 [개발자의 기록습관]
*/
public class MergeSort {
public static int[] src; 
public static int[] tmp; 
public static void main(String[] args) {
        src = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6}; 
        tmp = new int[src.length]; 
        printArray(src);
        mergeSort(0, src.length-1); 
        printArray(src); 
    }
    public static void mergeSort(int start, int end) { 
        if (start<end) {   //  merge sort 진행할 시작 인덱스  , end 마지막으로 포함될 배열의 인덱스 의미 (바이너리 트리 형태로 쪼개기 떄문에 mid는 start와 end 중간 지점)
            int mid = (start+end) / 2; 
            mergeSort(start, mid); 
            mergeSort(mid+1, end); 
            int p = start; // 두 분할의 첫번째 인덱스를 저장 -> 해당 인덱스의 값을 비교하여 어떤 원소를 참조할지 저장하기 때문 
            int q = mid + 1; 
            int idx = p;   // start 는 항상 mid+1 보다 작기때문에 분할의 저장위치는 start 지점이 된다. 그래서 int idx는 p 가 된다. 
            while (p<=mid || q<=end) { // 미만이 아닌 이유 -> 원소의 개수가 1개 일때까지 쪼개기 때문 
                if (q>end || (p<=mid && src[p]<src[q])) { 
                    tmp[idx++] = src[p++]; 
                } else { tmp[idx++] = src[q++]; } 
            } 
            for (int i=start;i<=end;i++) { 
                src[i]=tmp[i]; 
            } 
        } 
    } 
    public static void printArray(int[] a) {
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" "); System.out.println(); 
        }

    


}
