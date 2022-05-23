import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String str; // str을 만들어두고
        while ( (str = br.readLine()) != null){ // 이때 넣고
            StringTokenizer st = new StringTokenizer(str); // 그걸 활용. 계속 br.readline()쓰면 또 읽어와야 하기 때문.
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A + B).append("\n");
        }
        br.close();
        System.out.println(sb);

        // 이런경우 입력이 없어야 멈추기 때문에 IDE에선 ctrl+D or ctrl+Z를 눌러줘야 함
    }
}
