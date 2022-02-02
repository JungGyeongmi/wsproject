package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1157 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		char[] read = br.readLine().toCharArray();
		
		for(int i = 0; i < read.length; i++) {
		
			if((int)read[i]>=65 && (int)read[i]<=90) {
				// 대문자 // System.out.println((int)read[i]);
				arr[(int)read[i]-65]++;
			} else {
				// 소문자 // System.out.println((int)read[i]);
				arr[(int)read[i]-97]++;
			}
		}
		br.close();
		
		int max = arr[0];
		int idx = 0;
		for(int i =0; i< arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				idx = i;
			}
		}
		
		int count = 0;
		for(int i  = 0; i< arr.length; i++) {
			if(arr[i] == max) {
				count++;
			}
		}
		
		System.out.println(count>1?"?":(char)(idx+65));
		
		
		
		
	}
}
