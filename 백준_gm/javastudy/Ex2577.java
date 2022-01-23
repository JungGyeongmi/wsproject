package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int [3];
        for(int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int multiply = 1;
        for(int num : arr) {
            multiply *= num;
        }

        String temp = Integer.toString(multiply);
        String [] StrArr = new String[temp.length()];
        
        StrArr = temp.split("");

        // for(String i : StrArr) System.out.println(i);
        // System.out.println(temp.length());

        int[] result = new int[10];
        // for(int i =0; i<temp.length(); i++){
        //     result[i] =0;
        // }

        for(String number : StrArr) {
            for(int k=0; k<10; k++){
                if(Integer.toString(k).equals(number)) {
                    result[k] += 1;
                    continue;
                }
            }
        }

        for(int j : result) {
            System.out.println(j);
        }
        br.close();
    }
}
