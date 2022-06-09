import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = 0;
        if (B >= C) {
            N = -1;
        } else { // 0 > A + (B-C)*N 일떄 이익이 나는것인데
            // 그럼 N이 A/(C-B) = N이 되는데 수익이 나려면 1개 더 사야하므로 +1 한값이 되는것
            N = A/(C-B) +1;
        }
        System.out.println(N);
    }
}
