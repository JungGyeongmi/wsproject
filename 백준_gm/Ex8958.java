package study;

import java.io.IOException;
import java.util.Scanner;

public class Ex8958 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		 
		int n = in.nextInt();
//		System.out.println("갯수"+n);
		String arr[] = new String[n];
		
		for(int i=0; i < arr.length; i++) {
			String s = in.next();
			arr[i] = s;
//			System.out.println("문자열한줄"+s);
		}

		
//		문자 참조 방법 드뎍 찾음
//		System.out.println(arr[0].subSequence(0, 2));
		
		for (int i = 0; i < arr.length; i++) {
			int score = 0;
			int count = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				String check = (String)arr[i].subSequence(j, j + 1);
				if ("O".equals(check)) {
					count++;
					score += count;
				} else count = 0;
			}
			System.out.println(score);
		}
		
	}
}