import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P4_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = new int[2];
        for (int i = 0; i < 2; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        if (input[0] >0 ) {
            if (input[1] > 0) { // 두번째 양수
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (input[1] > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

//        System.out.println(Arrays.toString(input)); // 배열 전체 출력 방법
        }
}
