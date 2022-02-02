package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2908 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] read = br.readLine().trim().split(" ");
		String[] result = new String[read.length];
		for (int i = 0; i < result.length; i++)
			result[i] = "";

		for (int i = 0; i < read.length; i++) {
			String[] num1 = read[i].trim().split("");
			for (int j = num1.length - 1; j >= 0; j--) {
				result[i] += num1[j];
			}
		}
		// System.out.println(result[0]+" "+result[1]);
		br.close();

		int max = Integer.parseInt(result[0]);
		for (int i = 0; i < result.length; i++) {
			int num = Integer.parseInt(result[i]);
			if (max < num) {
				max = num;
			}
		}
		System.out.println(max);
	}
}
