package study;

import java.util.Scanner;

public class Ex2884 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int hour = in.nextInt();
		int min = in.nextInt();
		
		if(min<45) {
			if(hour > 0) hour--;
			else {
				hour=23;
			}
			min=60+(min-45);
			System.out.println(hour +" "+ min);
		} else {
			min=min-45;
			System.out.println(hour +" "+ min);
		}
	}
}
