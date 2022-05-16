import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P13_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[2];
        for (int i = 0; i < 2; i++) {
            input[i] = br.readLine();
        }
        for (int i = 2; i >=0; i--) {
            int n = input[1].charAt(i) - '0';
            System.out.println(Integer.parseInt(input[0]) * n);
        }
        System.out.println(Integer.parseInt(input[0]) *Integer.parseInt(input[1]));


//        int rest = input[1]; // 곱할 값
//        for (int i = 2; i >= 0; i--) {
//            double temp = rest / Math.pow(10, i); // 곱할 값의 몫
//            int temp_i = (int) temp; // 정수형 치환
//            double d = input[0] * temp_i ; // 곱할 값의 몫 곱함
//            rest = input[1] % Math.pow(10, i); // 곱할 값을 나머지로 다시 바꿈
//            System.out.println(d);
        }

    }

