package study;

import java.util.Scanner;

public class Ex1300 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num1 = in.nextInt();
		int num2 = in.nextInt();

		if (num1 == num2) {
			System.out.println("==");
		} else if (num1 > num2) {
			System.out.println(">");
		} else {
			System.out.println("<");
		}

	}

}
