package javastudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ex10818 {
    public static void main(String[] args) throws IOException{
        // 입력값 받기위한 버퍼 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력값 저장
        int range = Integer.parseInt(br.readLine());
        String numbers = br.readLine();

        // 공백기준 분리
        StringTokenizer st = new StringTokenizer(numbers, " ");

        // 각 값들을 저장할 ArrayList 생성
        List<Integer> arr = new ArrayList<>();

        // 배열에 값 저장
        for(int i =0; i<range; i++) {
            int number = Integer.parseInt(st.nextToken());
            arr.add(number);
        }
        // System.out.println(arr);

        // 기준값 초기화
        int max = arr.get(0);
        int min = arr.get(0);

        // 최대 최소 비교
        for(int j = 1; j <range; j++) {
            if(max < arr.get(j)) {
                max = arr.get(j);
            }

            if(min > arr.get(j)){
                min = arr.get(j);
            }
        }

        // System.out.printf("%d %d", min, max);

        bw.write(Integer.toString(min)+" "+Integer.toString(max));

        bw.flush();
        bw.close();
        // 버퍼 닫기
        br.close();

    }
}