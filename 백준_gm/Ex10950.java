package study;

import java.util.Scanner;

public class Ex10950 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int c = in.nextInt();
//		System.out.println(c); 길이값이네
		int arr[] = new int[c]; //5
	
		// 향상된 for문은 배열만 ? 그럼 arr쓸까
		// 사실 이렇게 해주는것보다 기본 for문 쓰는게 깔끔하겠네
		int j = 0; // idx 제어
		for (int i : arr) {
			int a = in.nextInt(); // 다음 값
			int b = in.nextInt(); // 다음 값
			arr[j] = a + b; // 배열에 저장
			j++;
		}
		in.close(); // 닫아주는게 좋다고 했음
	
		for (int k : arr) { // 배열 값들을 꺼내서 k에 넣음
			System.out.println(k);
		}
	}
}

