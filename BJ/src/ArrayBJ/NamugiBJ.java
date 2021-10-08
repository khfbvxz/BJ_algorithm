package ArrayBJ;

import java.util.Arrays;
import java.util.Scanner;

public class NamugiBJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [10];
		int [] ar = new int [10];
		int count = 0;
		for (int i = 0 ; i<10 ;i++) {
			int num = sc.nextInt();
			arr[i]	= num%42;
		}
		Arrays.sort(arr);
		ar[0]=arr[0];
		for(int i = 0 ; i<9; i++) {
			if(arr[i] != arr[i+1]) {
				ar[count++]=arr[i];
			}
		}
		System.out.println(count+1);
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(ar));
	}
}
