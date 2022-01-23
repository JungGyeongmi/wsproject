package javastudy.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // StringTokenizer st;
        String[] arr;
        for(int i=0; i<N; i++) {
            String temp = br.readLine();
            arr = new String[temp.length()];
            
            int count=0;
            int result=0;

            // 배열에 각 값을 저장
            for(int j=0; j<arr.length; j++) {
                arr[j] = temp.substring(j,j+1);
                if("O".equals(arr[j])) {
                    count++;
                    result += count;
                } else count = 0; 
            }
            System.out.println(result);
        }
        br.close();
    }
}
