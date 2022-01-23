package javastudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1546 {
 public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int[] origin = new int [N];
    for(int i=0; i<N; i++) {
        origin[i] = Integer.parseInt(st.nextToken());
    }


    int max = origin[0];
    for(int grade : origin) {
        if(max<grade) max = grade; 
    }
    
    double[] modified = new double[N];
    for(int i=0; i<N; i++) modified[i] = (double)(origin[i])/max*100;

    double result = 0;
    for(double i : modified) {
        result+=i;
    }

    System.out.print(result/N);
    br.close();

    }   
}
