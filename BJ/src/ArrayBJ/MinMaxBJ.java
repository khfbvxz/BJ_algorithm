package ArrayBJ;

import java.util.Scanner;

public class MinMaxBJ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min= 1000000 , max = -1000000;
		int n = sc.nextInt();
		int [] arr = {};
		for(int i = 0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i<n ; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		for(int i = 0 ; i<n ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print(min+" "+max);
	}
}
