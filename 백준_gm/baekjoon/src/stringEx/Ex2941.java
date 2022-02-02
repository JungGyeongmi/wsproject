package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ex2941 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> hm;
		int result=0;
		
		for (int i = 0; i < N; i++) {
			int check = 0;
			hm = new HashMap<>();
			char[] read = br.readLine().toCharArray();

			for (int j = 0; j < read.length; j++) {
				int ascii = read[j] - 97;
				if (!hm.containsKey(ascii)) {
					// System.out.println((char)(read[j])+" 초기화");
					hm.put(ascii, j);
				} else {
					if(j-hm.get(ascii)!=1) {
						// System.out.println((char)(read[j])+" 불연속");
						check++;
						break;
					} else {
						hm.put(ascii, j);
					}
				}

			}
			if(check == 0) {
				result++;				
			}
			// System.out.println(hm.toString());
		}
		
		System.out.println(result);

		br.close();
	}
}
