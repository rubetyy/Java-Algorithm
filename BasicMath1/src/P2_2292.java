import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2~7, 8~19, 20~37, 38~61.. 6N씩 늘어남
// 6 18 36 60 96
public class P2_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()); // 억단위라서 long으로 선언
        long sum = 1;
        long A = 1;
        while (sum < N) {
            sum += 6*A; // 6배수씩 늘려가면서 더해줌
            A++;
        }
        System.out.println(A);
    }
}
