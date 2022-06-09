import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for (int i = 0; i < TC; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // 층수(높이)
            int W = Integer.parseInt(st.nextToken()); // 길이(호수)
            int N = Integer.parseInt(st.nextToken()); // 몇명째인지

            int Y = 1; // 층수(앞부분)
            int X = 1; // 호수(뒷부분)

            // 우선순위1. 1호수부터터~W호수까지
            // 우선순위2. 1층부터~H층까지
            // 1호수에 H개 들어갈수 있으므로 H개로 나눠서 1층부터 넣으면 됌



            if (N % H == 0) { // 이게 0이면
                Y = H; // 끝이니까 H
                X = N / H;
            } else {
                Y = N % H;
                X = N / H + 1;
            }

            String XX ="";
            if (X < 10) {
                XX = "0" + String.valueOf(X);
            } else {
                XX = String.valueOf(X);
            }
            System.out.println(Y + XX);
        }

    }
}
