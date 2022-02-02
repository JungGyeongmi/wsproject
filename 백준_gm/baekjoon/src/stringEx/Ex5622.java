package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] read = br.readLine().toCharArray();
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) arr[i]=0;
		
		for(int i = 0; i < read.length; i++) {
			int dial = read[i]-65;
			if(dial >= 0 && dial <= 2) {
				arr[2]++;
			} else if (dial >= 3 && dial <= 5) {
				arr[3]++;
			} else if (dial >= 6 && dial <= 8) {
				arr[4]++;
			} else if (dial >= 9 && dial <= 11) {
				arr[5]++;
			} else if (dial >= 12 && dial <= 14) {
				arr[6]++;
			} else if (dial >= 15 && dial <= 18) {
				arr[7]++;
			} else if (dial >= 19 && dial <= 21) {
				arr[8]++;
			} else if (dial >= 22 && dial <= 25) {
				arr[9]++;
			}
		}// end of for
		
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				result += (i+1)*arr[i];
			}
		}
		
		System.out.println(result);

	}
}
