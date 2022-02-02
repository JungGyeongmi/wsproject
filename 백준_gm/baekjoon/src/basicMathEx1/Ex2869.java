package basicMathEx1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] read = br.readLine().trim().split(" ");
		
		int a = Integer.parseInt(read[0]);
		int b = Integer.parseInt(read[1]);
		int v = Integer.parseInt(read[2]);
	
		
		// days = v/(a-b);
		
		int days = (v-b)/(a-b);
		
		if((v-b)%(a-b)!=0) {
			days++;
		}
		
		System.out.println(days);
	}
}
