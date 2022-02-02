package basicMathEx1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Ex10757 {

	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] read = br.readLine().trim().split(" ");
		
		BigInteger a = new BigInteger(read[0]);
		BigInteger b = new BigInteger(read[1]);
		
		System.out.println(a.add(b));

	}

}
