import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1,2,3,4,...9,0 순으로 2초,...11초 걸림
// 2부터 9까지 알파벳 3개씩 있고 0은 연산자
// A가 65 A,B,C가 2에 있음 65,66,67 012 345 678. 2,3,4 3으로 나눴을때 몫에다가 2 더하기?
// 26개의 알파벳
public class P8_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int second = 0;
        for (int i = 0; i < S.length(); i++) {
            int v = S.charAt(i);

            if (v >=65 && v<=79) { // 연산자가 아닐때
                second += ((v - 65) / 3) + 3;
//                System.out.println(((v - 65) / 3) + 3);
            } else if (v >= 80 && v <= 83) {
                second += 8;
            } else if (v >= 84 && v <= 86) {
                second += 9;
            } else if (v >= 87 && v<= 90) {
                second += 10;
            }

//            else if (v == '+' || v == '-' || v == '/' || v == '%' || v == '*') {// 연산자일때
//                second += 11;
//            } else if (v == '1') {
//                second += 2;
//            }
        }
        System.out.println(second);
    }
}
