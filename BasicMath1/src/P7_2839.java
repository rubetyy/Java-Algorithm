import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 5kg, 3kg 종류 5kg을 최대로 쓰고 나머지 3kg으로 가져와야함
// 딱 안떨어지면 -1 출력
// 1. 5로 나눠서 나머지가 0,3이면 가능
// 2. 3으로 나눠서 나머지가 0이면 가능
public class P7_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (true) {
            if (N % 5 == 0) { // 5로 떨어지면
                cnt += N/5;
                System.out.println(cnt);
                break;
            } else { // 5로 안떨어지면 3빼고 다시 체크
                N -= 3;
                cnt++;
            }
            if (N < 0) { // 끝까지 안되면
                System.out.println(-1);
                break;
            }
        }

    }
}
