import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P6_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String quiz = br.readLine();
            int cnt = 0;
            int total = 0;
            for (int j = 0; j < quiz.length(); j++) {
                char str = quiz.charAt(j);
//                System.out.println(quiz.charAt(j));
                if (str == 'O') {
                    cnt ++;
                    total += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(total);
        }
    }
}
