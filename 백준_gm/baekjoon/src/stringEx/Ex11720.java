package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11720 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		arr = br.readLine().split("");
		int result=0;
		
		for(String tem : arr) {
			result  += Integer.parseInt(tem);
		}
		System.out.println(result);
		
		br.close();
	}
}
