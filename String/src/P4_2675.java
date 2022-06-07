import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine()); // 테스트케이스 개수 받고

        for (int i = 0; i < TC; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken()); // 반복 수
            String S = st.nextToken(); // 반복할 문자열
            // 문자열에서 각 문자를 N번씩 출력하면 되는데
            for (int j = 0; j < S.length(); j++) {
                char ch = S.charAt(j); // 문자로 나누고
                for (int k = 0; k < N; k++) {
                    System.out.print(ch);
                }
            }
            System.out.println(); // 이게 있어줘야함 (직접입력해봐야 알 수 있음)
        }
    }
}
