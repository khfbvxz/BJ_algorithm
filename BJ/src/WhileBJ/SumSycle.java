package WhileBJ;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

// 프로그램 종료 조건이 없다. 
// 데이터가 없는 경우를 알려주어야 한다.
// hasnextInt() scanner 객체에 입력값이 int 인 경우 true 를반환 
public class SumSycle {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = 0, n = 0 , n3 =0;
		int b = 0, n2 = 0, count = 0;
		int tmp =0;
		n = sc.nextInt();
		n3 = n;
		while (true) {
			if (n3 < 10) {a = 0;b = n3;}
			else {a = n3/10;b = n3%10;}
//			System.out.printf("a = %d  b = %d \n",a,b);
			n2 = a + b;
//			System.out.println("n2 = " +n2);
			tmp = b*10 + n2%10;
//			System.out.printf("tmp = %d  count= %d  \n",tmp,count);
			n2 = tmp;
			n3 = n2;
//			System.out.println(n3);
			count++;
			if (n == n2) {
				break;
			}		
		}
		System.out.println(count);
	}
}
