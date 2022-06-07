import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = check(Integer.parseInt(br.readLine()));
        System.out.println(result);
    }

    public static int check(int num) {
        int cnt = 0; // 한수 개수

        if (num < 100) {
            return num;
        }
        else {
            cnt = 99; // 100이상이면 일단 100전의 숫자들은 다 등차수열이므로 99로 초기화하고 시작
            for (int i = 100; i < num+1; i++) {
                int hun = i / 100; // 백의 자리
                int ten = (i / 10) % 10; // 십의 자리
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
