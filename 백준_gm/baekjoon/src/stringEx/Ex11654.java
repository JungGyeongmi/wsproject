package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;

public class Ex11654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char myChar = br.readLine().charAt(0);
//		System.out.println(myChar);
		int result = (int)myChar;
		System.out.println(result);
		
//		byte[] bytes = br.readLine().getBytes(StandardCharsets.US_ASCII);
//		System.out.println(bytes[0]);
	}
}
