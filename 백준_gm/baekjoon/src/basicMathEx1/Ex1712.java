package basicMathEx1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1712 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] read =br.readLine().trim().split(" ");
		
		int a = Integer.parseInt(read[0]);
		int b = Integer.parseInt(read[1]);
		int c = Integer.parseInt(read[2]);
		
		if (c-b<=0) {
			// 손익 분기점 발생하지 않음
			System.out.println("-1");
		}
		else {
			System.out.println(a/(c-b)+1);
		}

	}
}
 