package javastudy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TOTALN = Integer.parseInt(br.readLine());

        for(int i =0; i<TOTALN; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int LINEN = Integer.parseInt(st.nextToken()); 
            int[] arr = new int[LINEN];
            int sum = 0;
            int count = 0;
            double avg = 0.0;
            for(int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());                
                sum += arr[j];
            }
            avg = (double)sum/LINEN;
            for(int grade : arr) {
                if(grade > avg) {
                    count ++;
                }
            }
            double result = (double)count/LINEN*100;
            System.out.printf("%.3f%s%n", result,"%");   
        }
        br.close();
    
    }
}
