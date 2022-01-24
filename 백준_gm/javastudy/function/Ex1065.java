    package javastudy.function;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class Ex1065 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            
            int count = 0;
            
            if(N >= 100) {
                // collections intstream으로 바꿔보기
                for(int i = 100; i <= N; i++) {
                    String[] numbers = Integer.toString(i).split("");
                    int a = Integer.parseInt(numbers[0]);
                    int b = Integer.parseInt(numbers[1]);
                    int c = Integer.parseInt(numbers[2]);
                    
                    boolean isHan = (a-b==b-c? true : false);
                    if(isHan) {
                        System.out.printf("%d %d %d %d%n",a, b, c ,i);
                        count += 1;
                    }
                }
                count += 99; 
                // 2자리 수 이상이면 그 이전의 한수 값들을 더해줌 100부터 시작하니까
            } else {
                count = N;
            }
            System.out.println(count);
            br.close();
        }
    }
