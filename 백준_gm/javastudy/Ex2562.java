package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int max = arr[0];
        int counter = 0;   
    
        // 비교
        for(int j =0; j<arr.length; j++) {
            if(max < arr[j]) {
                max = arr[j];
                counter = j+1;
            }
        }

        System.out.print(max + "\n" + counter);
        br.close();
    }
}
