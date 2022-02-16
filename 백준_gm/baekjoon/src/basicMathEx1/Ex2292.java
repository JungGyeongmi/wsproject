package basicMathEx1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex2292 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(br.readLine());
		int range = 2;
		int count = 1;
		
		if(number == 1) {
			bw.write("1");
		} else {
			while(number != 1) {
				 if(range <= number && number < range+(6*count)) {
					bw.write(Integer.toString(count+1));
					break;
				}
				 range = range+(6*count);
				 count++;
			}
		}
		
		br.close();
		bw.flush();
		bw.close();

	}
}
