import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 거꾸로 돌리고 큰수를 정답 그리고 그 수 출력

// 돌리려면 문자열 2개를 받고
// 각각 for 문을 사용해서 반대로 돌려줘야함
public class P7_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        String RA = "";
        String RB = "";

        for (int i = 2; i > -1; i--) {
            RA += A.charAt(i);
            RB += B.charAt(i);
        }
        int AA = Integer.parseInt(RA);
        int BB = Integer.parseInt(RB);
        System.out.println(Math.max(AA,BB));
    }
}
