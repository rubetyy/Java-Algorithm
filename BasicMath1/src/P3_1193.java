import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1,3,6,10,... 2-3-4 1씩 늘어나는 만큼 늘어남
public class P3_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 1; // 맨 첫번째 줄 기준 몇번째 칸의 대각선에 속하는가
        int sum = 1;
        int A = 2;

        while (N > sum) {
            sum += A; // 누적 합
            A++; // 1씩 늘어나면서 더할 수 있게
            cnt++; // 누적 합 씩 늘어나면 1칸씩 늘어남
        }
        int down; // 분모
        int up; // 분자
        if (cnt % 2 == 0) { // 짝수면 위에서 내려옴
            down = cnt;
            up = 1;
            for (int i = 0; i < sum-N; i++) { // 차이만큼 내려옴
                down-=1;
                up+=1;
            }
        } else { // 홀수면 아래서 올라감
            down = 1;
            up = cnt;
            for (int i = 0; i < sum-N; i++) { // 차이만큼 올라감
                down += 1;
                up -= 1;
            }
        }

        System.out.println(down+"/"+up);
    }
}
