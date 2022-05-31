import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double total = 0;
            int num = Integer.parseInt(st.nextToken());
            int[] arr = new int[num];

            for (int j = 0; j < num; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                total += arr[j];
            }
//            System.out.println(total);
            double avg = total / num;
            double cnt = 0;
            for (int v: arr) {
                if (v > avg) {
                    cnt ++;
                }
            }
            System.out.printf("%.3f%%\n",cnt / num * 100);
            // printf를 써서 %.3f로 해야 소수 셋째자리까지 출력
            // %% 로 적어야 % 문자 출력
            // \n으로 한줄띄어쓰기

        }
    }
}
