package basicMathEx2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Ex2581 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;
		int count = 0;
		List<Integer> resultList = new ArrayList();
		
		for(int i = M; i <= N; i++) { // M �� N���� �ݺ� ����
			// ����� ���� i 
			count = 0;
			for(int j = 1; j<=i; j++) {
				if(i%j==0) count ++; // count�� 2 �̻��̸� �Ҽ��ƴ� 
				else if (count > 2) break; // �Ҽ��� �ƴϸ� �ٷ� ĿƮ
//				System.out.println("j"+j);
			}
			if(count == 2) {
				sum+=i;
				// �Ҽ��� ��츸 �ջ�
				resultList.add(i);
				// list�� �߰�
			} 
		}
		
		if(!resultList.isEmpty()) {
			min = resultList.get(0);
			for(int i = 0; i <resultList.size(); i++) {
				min = (min>resultList.get(i))?resultList.get(i):min;
			}
		}
		
		
//		System.out.println(sum);
		if(sum == 0) { 
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
//			bw.write(Integer.toString(sum));
//			bw.write("\r\n");
//			bw.write(Integer.toString(min));
		/*
			 �ٹٲ��� �ϱ����� ���� , ���๮���� \n�� ���� �ɰŰ����� \r�� ����Ѵ�
			 \r�� �ش��ϴ� �ƽ�Ű�ڵ�13 ��
		     \n�� �ش��ϴ� �ƽ�Ű�ڵ� 10�̵��ÿ� �ԷµǴ°� ����
		     ���Ͽ� ������ ����Ű�� ��Ȯ�ϰ� \r\n���� �Է��ؾ� �ν��ϴ°� ����
		*/
		}
		
//		bw.flush();
//		bw.close();
//		br.close();
//		
	}

}
