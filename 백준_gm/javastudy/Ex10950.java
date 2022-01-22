package javastudy;

import java.util.Scanner;

public class Ex10950 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int c = in.nextInt();
//		System.out.println(c); ���̰��̳�
		int arr[] = new int[c]; //5
	
		// ���� for���� �迭�� ? �׷� arr����
		// ��� �̷��� ���ִ°ͺ��� �⺻ for�� ���°� ����ϰڳ�
		int j = 0; // idx ����
		for (int i : arr) {
			int a = in.nextInt(); // ���� ��
			int b = in.nextInt(); // ���� ��
			arr[j] = a + b; // �迭�� ����
			j++;
			System.out.println(i);
		}
		in.close(); // �ݾ��ִ°� ���ٰ� ����
	
		for (int k : arr) { // �迭 ������ ������ k�� ����
			System.out.println(k);
		}

	}
}

