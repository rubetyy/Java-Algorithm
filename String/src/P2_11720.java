import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class P2_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;

//        for (int i = 0; i < N; i++) {
//            sum += br.read() - 48;
//        }

        for (byte value:br.readLine().getBytes()) {
            sum += (value - '0');
        }

        System.out.println(sum);
    }
}
