import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 1; i < N+1; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
