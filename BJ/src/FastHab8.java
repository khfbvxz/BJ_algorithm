package WhileBJ;

import java.io.*;
import java.util.*;

public class FastHab8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for ( int i = 1 ; i <=T ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());	
			bw.write("Case #"+String.valueOf(i)+": "+a+" + "+b+" = "+(a+b)+"\n");
		}
		bw.flush();
		bw.close();
	}
}
