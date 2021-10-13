package string;

import java.util.Scanner;

public class NumberHabS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String num = sc.nextLine();
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            // System.out.println();
            // int a = Character.getNumericValue(num.charAt(i)) ; // 방법 2
            // int b = num.charAt(i)-'0'; // 방법 1
            sum+=Character.getNumericValue(num.charAt(i));
        }
        System.out.println(sum);
        sc.close();
    }

}
