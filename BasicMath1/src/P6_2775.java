// 해설확인
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// (k-1)층의 1호~n호까지 사람들의 수 합
public class P6_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] APT = new int[15][15];
        for (int i = 0; i < 15; i++) { // 기
            APT[i][1] = 1; // 1호는 모두 1
            APT[0][i] = i; // 0층은 호수에 맞게
        }
        for (int i = 1; i < 15; i++) { // 0층은 채웠으니 1층부터
            for (int j = 2; j < 15; j++) { // 2호부터
                APT[i][j] = APT[i][j-1] + APT[i-1][j]; // 2층 2호 = 2층 1호 + 1층 2호
            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine()); // 층 (0층~k호)
            int n = Integer.parseInt(br.readLine()); // 호 (1호~n호)
            System.out.println(APT[k][n]);
        }
    }
}
