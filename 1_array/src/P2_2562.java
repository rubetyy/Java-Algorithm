import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;
        int sortN = 0;
        for (int j = 0; j < 9; j++) {
            if (arr[j] > max) {
                max = arr[j];
                sortN = j+1;
            }
        }
        System.out.println(max);
        System.out.println(sortN);
    }
}
