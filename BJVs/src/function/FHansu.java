package function;

import java.util.Scanner;

/*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 
 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 
 입력
 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

*/
public class FHansu {
    static int count =0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <=n ;i++){
            hansu(i);
        }
        System.out.println(count);
        sc.close();
    }
    public static void hansu(int n){
        if(n<100){
            count++;
        }else if(n>=100 && n<1000){
            int hun = n/100;
            int ten = (n-hun*100)/10;
            int one = (n-hun*100-ten*10); 
            if( (hun-ten)==(ten-one) ){count++;}
            else{}                
        }else{}    
    }
}
