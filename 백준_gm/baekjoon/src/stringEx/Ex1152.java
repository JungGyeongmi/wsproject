package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1152 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String read = br.readLine();
		
		StringTokenizer st = new StringTokenizer(read, " ");
		
		System.out.println(st.countTokens());
	}
}
