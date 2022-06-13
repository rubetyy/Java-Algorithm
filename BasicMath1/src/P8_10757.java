import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P8_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(st.nextToken()); // BigInteger을 이용해야함
        BigInteger B = new BigInteger(st.nextToken());
        A = A.add(B); // add로 더할 수 있음
        System.out.println(A);

    }
}
