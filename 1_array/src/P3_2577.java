import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = A * B * C;
        String Sresult = String.valueOf(result); // 결과를 string으로 변환 
        int[] arr = new int[10]; // 0~9 까지 셀꺼 담은거
        char[] arr2 = Sresult.toCharArray(); // char형태로 하나씩 담을꺼
        for (int i = 0; i < arr2.length; i++) { // char형태로 담은 만큼 돌리면서
//            System.out.println(arr2[i] - '0');
            arr[arr2[i] - '0']++; // 개수 하나씩 추가 (char - '0' 하면 숫자로 바뀜)
//            System.out.println(arr[i]);
        }
        for (int v: arr) { // 다 더해주고 foreach문으로 빼서 보여줌
            System.out.println(v);
        }



    }
}
