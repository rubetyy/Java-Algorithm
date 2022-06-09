import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 낮에 A미터 올라가고 밤에 B미터 미끄러지고 정상이면 스탑
public class P4_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int N = 1;
        // 낮에 도착하는걸 기준으로 둔다면
        // 1일차는 A, 2일차는 A-B+A...
        // AN - (N-1)B >= V
        // AN - BN + B >= V
        // (A-B)N >= V-B
        // N >= (V-B) / (A-B)  = 해당 값이 딱 떨어지지 않는다면 하루 더 가야함
        N = (V-B) / (A-B);
        if ((V-B) % (A-B) != 0) {
            N+=1;
        }
        System.out.println(N);
    }
}
