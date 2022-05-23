import java.io.*;
import java.util.StringTokenizer;

public class P4_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            bw.write(A+B + "\n"); // 버퍼에 있는 값 모두 출력
        }
        br.close();
        bw.flush(); // 남아있는 데이터를 모두 출력시킴
        bw.close(); // 스트림을 닫음
    }
}
