package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SanSuS  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a =br.readLine();
        String []arr =a.split(" ");
        int max=-1;
        for(int i = 0 ; i<2; i++){
            if(max<reverse(Integer.parseInt(arr[i])))
                max=reverse(Integer.parseInt(arr[i]));
        }
        System.out.println(max);
    }
    public static int reverse(int a){
        
        int hun = a/100;
        int ten = (a-hun*100)/10;
        int one = (a - hun*100 - ten*10);
        int n = one*100 + ten*10 + hun;
        
        return n;
    }
}
