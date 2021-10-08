package WhileBJ;

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
public class WhileSecond {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int x , y, sum;
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			if(a<10) {
				x = 0;
				y = a;
				sum = x+y;
				System.out.println(sum);
			}
			else {
				x = (int)a/10;
				y = (int)a%10;
				sum = x +y;
				System.out.println(sum);
				
			}
			

		}
	}
}
