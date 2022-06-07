import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int ch = br.readLine().charAt(0); // string에서 char로 저장 후, int 타입 변수에 저장하면 아스키 코드값을 저장하게 된다
        int ch = br.read(); // 근데 이렇게 하면 애초에 문자 하나만 받아서 char로 받아짐
        System.out.println(ch);
    }
}
