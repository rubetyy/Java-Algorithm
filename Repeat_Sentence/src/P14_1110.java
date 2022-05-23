import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// AB => A + B = CD ==> BD
public class P14_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int N = Integer.parseInt(br.readLine());
        while (true){

            int L = N / 10;
            int R = N % 10;

            int result = R*10 +(L+R) % 10;
            cnt ++;
            if (result == N) {
                break;
            }
            System.out.println(cnt);
        }
    }
}
