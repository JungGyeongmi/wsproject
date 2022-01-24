package javastudy.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4673 {
    public static void main(String[] args)  {
        int counter = 0;
        for(int i = 1; i <= 100; i ++){

            d(i, counter);
        }
    }
    public static void d (int number, int counter) {
        // origin
        int origin = number;


        String[] tempArr = Integer.toString(number).split("");
        int[] arr = new int [tempArr.length];
        for(int i=0; i<tempArr.length; i++) {
            arr[i] = Integer.parseInt(tempArr[i]);
        }
        
        for(int num : arr) {
            number += num;
        }

        if(origin != number) {
            counter++;
        }
        d(number, counter);
    }
}
