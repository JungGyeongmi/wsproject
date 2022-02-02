package basicMathEx1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10250 {
	public static void main(String[] args) throws IOException {
		/*
		 * int N = 72; int H = 30; int W = 50; 
		 * System.out.println(N % H + " Ãþ ");
		 * System.out.println(N / H + 1 + " È£ "); 
		 * 
		 * int X, Y;
		 * if (N % H == 0) { Y = H * 100; X = N / H; } else { Y = (N % H) * 100; X = (N / H) + 1; }
		 * 
		 * int XXYY = Y + X;
		 *
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int totalN = Integer.parseInt(br.readLine());

		for (int i = 0; i < totalN; i++) {
			String[] read = br.readLine().trim().split(" ");

			int H = Integer.parseInt(read[0]);
			int N = Integer.parseInt(read[2]);
			
			int floor = 0;
			int room = 0;
			
			if(N%H==0) {
				floor = H*100;
				room =N/H;
			} else {
				floor = (N%H)*100;
				room = N/H+1;
			}
			System.out.println(floor+room);
		}

		br.close();
	}
}
