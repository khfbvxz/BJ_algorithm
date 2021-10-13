package testp;

// import java.util.Arrays;
import java.util.Scanner;

public class AvgNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int a = 0;
		int sum = 0;
		int count;
		int[][] arr = new int[c][];
		double [] avg =new double [c];
		for(int i = 0 ; i<c ; i++) {
			sum = 0 ;
			a = sc.nextInt();
			arr[i] = new int [a];
			for(int j = 0 ; j<a;j++) {
				arr[i][j] = sc.nextInt();
				sum+=arr[i][j];
			}
			avg[i] = (double)sum/(arr[i].length);
		}//for end  배열 만들기
		
		for(int i = 0 ; i<c ;i++) {
			count =0;
			for(int j = 0 ; j<arr[i].length ; j++) {
				if (arr[i][j] >avg[i]) {
					++count;
				}
			}
			System.out.printf("%.3f%%\n",(double)count*100/(double)arr[i].length);
		}
//		System.out.println(Arrays.toString(avg));
//		System.out.println(Arrays.deepToString(arr));
		sc.close();
    }
}
