package basicMathEx2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1978 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int tc = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int result = 0;
		int count = 0;
		
		for(int i = 0; i < tc; i++) {
//		while(st.hasMoreTokens()) {
			count = 0;
			int num = Integer.parseInt(st.nextToken());
			for(int j = 1; j <= num; j++) {
				if(num%j==0) {
//					System.out.println(num+" "+j);
					count++;
				}
			}
			if(count==2 && num != 1) result++;
		}
		bw.write(Integer.toString(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
