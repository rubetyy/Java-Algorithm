import java.io.*;

public class P10_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();
        for (int i = 1; i < N+1; i++) {
            for (int j = 0; j < N-i; j++) {
                bw.write(" ");
            }
            for (int k = 0; k < i; k++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }
}
