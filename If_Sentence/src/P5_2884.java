import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P5_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(Arrays.toString(br.readLine().split(" ")));
//        int[] input = Integer.parseInt(br.readLine().split(" ")); // 이건 왜 안되나
        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        if (M >= 45) {
            System.out.println(H +" " + (M-45));
        } else {
            if (H == 0) {
                System.out.println(23 + " " +(60 + M - 45) );
            } else {
                System.out.println((H-1) + " " + (60 + M - 45));
            }
        }


    }
}
