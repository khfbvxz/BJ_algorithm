import java.io.*;
//import java.util.ArrayList;
import java.util.StringTokenizer;
public class XAH {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st, stt;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int [] innum=new int[n];
		stt = new StringTokenizer(br.readLine());
		for (int i =0 ; i<n;i++) {
			innum[i]=Integer.parseInt(stt.nextToken());
		}	
		for (int i = 0 ; i<n ;i++) {

			if (innum[i]<x) 
				bw.write(String.valueOf(innum[i])+" ");
		}
		bw.flush();	
}
}
