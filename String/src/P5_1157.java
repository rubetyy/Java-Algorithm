import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대소문자 구분없이 하려면 전부 대문자 or 소문자로 바꿔버리고
// 문자 하나씩 받으며 26개의 인덱스에 맞게 배열에 값 +1 추가
// 배열 최댓값 구하고
// 배열 전체 돌리면서 최대값이랑 비교해서 같은게 2번이상이면 ? 출력, 아니면 최댓값 출력
public class P5_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine().toLowerCase();

        int[] arr = new int[26];
        for (int i = 0; i < S.length(); i++) {
            int v = S.charAt(i) - 97;
            arr[v] += 1;
        }
        int iMax = 0;
        for (int v: arr) {
            iMax = Math.max(v, iMax);
        }
        int cnt = 0;
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == iMax) {
                cnt++;
                idx = i;
            }
        }

        if (cnt < 2) {
            char result = (char) (idx + 65);
            System.out.println(result);
        } else {
            System.out.println("?");
        }

    }
}
