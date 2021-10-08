package ArrayBJ;

import java.util.Arrays;
import java.util.Scanner;

public class OXquizBJ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String [] q = new String[n];
		char [][] arr = new char [n][];
		for (int i = 0 ; i<n ; i++) {
			q[i] = sc.nextLine();
			arr[i]=q[i].toCharArray();
		}
		
//		System.out.println(Arrays.toString(q));
//		String a = "OXOOX";
//		System.out.println(Arrays.deepToString(arr));
		int count =0;
		int sum = 0;
		for(int i = 0 ; i<n; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				if(arr[i][j]=='O') {
					sum+=(1+count);
					try{if(arr[i][j]==arr[i][j+1]){count++;}}catch( java.lang.ArrayIndexOutOfBoundsException ex) {sum=sum;}
//					if(arr[i][j]==arr[i][j+1]){count++;}
//					else {count=0;}
				}else {
					count =0;
				}	
			}// for 2 end (arr[i][j]==arr[i][j+1]
			System.out.println(sum);
			sum = 0;
			count = 0;
		}//for 1 end
		
	}
}
