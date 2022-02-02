package stringEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10809 {
	public static void main(String[] args) throws IOException {
		// a의 아스키는 97 부터  z의 122까지 이루어진다 총 25개
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		char[] read = br.readLine().toCharArray();
		// 선언 및 초기화
		int[] result = new int[25];
		for(int i = 0; i<result.length; i++) result[i] = -1;
		
		// System.out.println((int)read[0]);
		
		for(int i = 0; i < read.length; i++) {
			for(int j=97; j<123; j++) {
				if((int)(read[i]) == j) {
					
					// System.out.println(j-97);
					
					result[j-97]=i;
				}
			}			
		}
		
		for(int r : result) System.out.print(r+" ");
		
		
	}
}
