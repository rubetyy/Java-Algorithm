import java.io.*;
import java.util.StringTokenizer;

public class P12_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 이걸 반복문 안쪽에서 읽어야함
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0) {
                break;
            }
            int result = A + B;
            sb.append(result).append("\n"); //append로하고
        }
        System.out.println(sb); // 한번에 출력
    }
}
