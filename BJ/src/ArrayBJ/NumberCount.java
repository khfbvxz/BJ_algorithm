package ArrayBJ;

import java.util.Scanner;

public class NumberCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int gob ;
		gob = a*b*c;
		String number = String.valueOf(gob);
		char[] digit = number.toCharArray();
		int[] arr = new int[10];
		for (int i = 0 ; i < digit.length;i++) {
			switch (digit[i]) {
			case '0':arr[0]+=1;break;
			case '1':arr[1]+=1;break;
			case '2':arr[2]+=1;break;
			case '3':arr[3]+=1;break;
			case '4':arr[4]+=1;break;
			case '5':arr[5]+=1;break;
			case '6':arr[6]+=1;break;
			case '7':arr[7]+=1;break;
			case '8':arr[8]+=1;break;
			case '9':arr[9]+=1;break;
			}
		}
		for(int i = 0 ; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
