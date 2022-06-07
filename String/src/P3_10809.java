import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 풀이방법: 처음에 char형태로 하나씩 a~z까지 들어갈 배열 넣어놓고 -> ㄴㄴ 넣어놓는게 아니라 그냥 인덱스맞추는 느낌?
// a가 141이니까 -141해서.
// 문자를 받을 때 한글자씩 받으면서 해당 받은거의 아스키코드로 숫자로 바꾸고 인덱스 맞춰서 
// 넣는 값은 for 문 돌면서 1씩 증가하게 하는 것.
// 마지막으로 한번 더 돌면서 값없으면 -1 대입

public class P3_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] S =  br.readLine().toCharArray();
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
                arr[i] = -1;
        }
        // a= 97 , z=122
        int cnt = 0;
        for (int i = 0; i < S.length; i++) {
            int v = S[i] - 97;
            if (arr[v] == -1) {
                arr[v] = cnt;
            }
            cnt++;
        }

//        System.out.println(Arrays.toString(arr));
        for (int v: arr) {
            System.out.print(v + " ");
        }

    }
}
