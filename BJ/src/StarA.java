import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StarA {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for (int j = 1; j <= N; j++) {
		
			for (int i = N; i > 0; i--) {
				if(j<i) {bw.write(" ");}
				else{bw.write("*");}
				bw.flush();
			}
			bw.write("\n");
		}
	}
}
