package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 전체 반복 횟수
		int TN = Integer.parseInt(br.readLine());

		for (int i = 0; i < TN; i++) {
			// 한 줄
			String[] read = br.readLine().split(" ");
			int N = Integer.parseInt(read[0]);
			String[] input = read[1].split("");

			for (int j = 0; j < input.length; j++) {
				for (int k = 0; k < N; k++) {
					System.out.print(input[j]);
				}
			}
			System.out.println();
		}

		br.close();
	}
}
