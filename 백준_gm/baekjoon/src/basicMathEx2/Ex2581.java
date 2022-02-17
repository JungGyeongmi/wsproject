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
		
		for(int i = M; i <= N; i++) { // M 과 N으로 반복 제어
			// 검토될 수는 i 
			count = 0;
			for(int j = 1; j<=i; j++) {
				if(i%j==0) count ++; // count가 2 이상이면 소수아님 
				else if (count > 2) break; // 소수가 아니면 바로 커트
//				System.out.println("j"+j);
			}
			if(count == 2) {
				sum+=i;
				// 소수인 경우만 합산
				resultList.add(i);
				// list에 추가
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
			 줄바꿈을 하기위해 삽입 , 개행문자인 \n만 쓰면 될거같지만 \r도 써야한다
			 \r에 해당하는 아스키코드13 과
		     \n에 해당하는 아스키코드 10이동시에 입력되는걸 봐서
		     파일에 쓸때는 엔터키를 명확하게 \r\n으로 입력해야 인식하는것 같음
		*/
		}
		
//		bw.flush();
//		bw.close();
//		br.close();
//		
	}

}
