package string;

import java.util.Scanner;
import java.nio.charset.StandardCharsets;
// 문제 알파벳 소문자 대문자 숫자 0~9 중 하나가 주어졌을 때 아스키 코드값 출렧
public class AsciiS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char c =sc.next().charAt(0);
        // int a = c;
        String s = sc.next();
        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes[0]);
        sc.close();
    }
}
