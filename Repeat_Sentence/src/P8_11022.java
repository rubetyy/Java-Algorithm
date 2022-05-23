import java.io.*;
import java.util.StringTokenizer;

public class P8_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i < N+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A  = st.nextToken();
            String B = st.nextToken();
            int result = Integer.parseInt(A)+ Integer.parseInt(B);
            bw.write("Case #" + String.valueOf(i) + ": " + A + " + " + B + " = " + String.valueOf(result));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
