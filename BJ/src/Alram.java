import java.util.Scanner;

public class Alram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h;
		int m;
		h = scan.nextInt();
		m = scan.nextInt();
		if (m < 45) {
			h= h-1;
			m = (60 - 45) + m;
			if (h == -1 )
				h = 23;
			System.out.printf("%d %d", h, m);

		} else {
			m =  m - 45;
			System.out.printf("%d %d", h, m);
		}

	}
}
