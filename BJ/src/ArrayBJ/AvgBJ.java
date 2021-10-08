package ArrayBJ;

import java.util.Arrays;
import java.util.Scanner;

public class AvgBJ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double [] arr = new double [n];
		double avg=0;
		double max = 0;
		for(int i = 0 ; i <n;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		for(int i =0 ; i<n ; i++) {
			avg+=arr[i]/max*100.0;
		}

		System.out.println(avg/n);
	}
}
