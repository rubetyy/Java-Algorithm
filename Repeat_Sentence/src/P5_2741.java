import java.io.*;

public class P5_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i < N+1; i++) {
            bw.write(String.valueOf(i) + "\n"); // int는 출력이 안돼서 바꿔줘야함
//            System.out.println(i); // 964 -> 292 까지 줄임
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
