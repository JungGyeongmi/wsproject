package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int[] temp = new int[10];
        int count = 0;
        for(int num : numbers) {
            temp[count] = num%42;
            // System.out.println(temp[count]);
            count++;
        }

        int result = 1;
        for(int i=0; i<temp.length; i++){
            for(int j = i+1; j < temp.length-i; j++){
                if(temp[i] != temp[j]) {
                    result++;
                    break;
                }
            }
        }

        System.out.print(result);
        br.close();
    }
}
