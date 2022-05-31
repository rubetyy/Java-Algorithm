import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P5_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        double M = arr[N-1];
        double total = 0;
        for (int j = 0; j < N; j++) {
            total += (arr[j] / M) *100; // 이 계산을 위해 M이 double형이여야 됌? 왜???
            // 40 / 80하면 0.5지만 int 라서 0으로 간주해서 계산이 안되는 거였음!!ㄸ
            System.out.println(total);
        }
        System.out.println(total / N);
    }
}
