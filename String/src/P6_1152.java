import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int cnt = 0;
        String S = br.readLine();
        String[] arr = S.split(" ");
        for (String s:arr) {
            if (s != "") {
                cnt++;
            }
        }
        System.out.println(cnt);

//        while (st.nextToken() != null) {
//            System.out.println(st.nextToken());
//        cnt++;
//        }
    }
}
