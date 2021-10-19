package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// import java.util.Scanner;
// import java.util.StringTokenizer;
import java.util.Scanner;



/*
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/
public class WordStudyS {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str ; 
        str = br.readLine();
        str = str.toUpperCase();
        char [] arrString = new char [str.length()];
        int []count = new int [26];
        
        for(int i =0; i<arrString.length; i++){
            arrString[i]=str.charAt(i);
            count[arrString[i]-65]+=1;
        }
        int max=-1;
        int max_index=0;
        for(int i = 0 ; i<26;i++){
            if(count[i]>max){
                max=count[i];
                max_index=i;
            }
        }
        // System.out.print(max_index + "  ");
        // System.out.println("\n"+max);
        // max랑 max_index사용해서 출력. 비교 countinue 사용해소 그 인덱스만 빼고
        int cnt = 0;
        for(int i = 0 ; i<26;i++){
            if(count[i] == max){
                cnt++;
            }
        }
        if (cnt>=2){
            System.out.println("?");
        }
        else if(cnt==1){
            char cc= (char)(max_index+65);
            System.out.println(cc);
        }
        // System.out.println(Arrays.toString(arrString));
        // System.out.println(Arrays.toString(count));
    }
        //또다른 풀이

    // Scanner sc = new Scanner(System.in);
    // int[] arr = new int[26];
    // String a = sc.next().toUpperCase();
    // int max = -1;
    // char st = '?';
    // for(int i = 0 ; i<a.length();i++){
    //     arr[a.charAt(i)-65]++;
    //     if(max<arr[a.charAt(i)-65]){
    //         max = arr[a.charAt(i)-65];
    //         // System.out.println(max);
    //         st = a.charAt(i);
    //         // System.out.println(st);
    //     }
    //     else if(max == arr[a.charAt(i)-65]) {
    //         // System.out.println(arr[a.charAt(i)-65]);
    //         st='?';
    //     }
    //     System.out.println(arr[a.charAt(i)-65]);
    // }
    // System.out.println(st);
    // System.out.println(Arrays.toString(arr));
    // }

}
