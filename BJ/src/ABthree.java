import java.util.Scanner;

public class ABthree {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t;
		t = scan.nextInt();
		int [] first = new int [t];
		int [] second = new int [t];
		for (int i = 0 ; i <t ; i++) {
			int a ;
			int b ;
			a = scan.nextInt();
			b = scan.nextInt();
			first[i] = a;
			second[i] = b;
		}
		for(int i = 0 ; i<t ; i++) {
			System.out.println(first[i]+second[i]);
		}
	}

}
