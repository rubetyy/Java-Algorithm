import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 전부 다르거나 연속한게 있을 경우 +1 카운팅
// 알파벳 배열을 만들고
// 우선적으로 다음꺼와 비교해가면서 연속된게 있는지 있으면 멈추고 바로 +1 (X)
// => ㄴㄴ 이게 아니라 그냥 알파벳 체크에 +1을 안해주면 됌

// 없는 경우엔 밑의 반복문을 진행
//  해당 배열인덱스에 맞게 +1 을 해서 바로 그 값 확인해서 +1 했을때 2이상이면 멈추고 다음단어로 넘어감


public class P10_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0; // 결과

        for (int i = 0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            int[] check = new int[26]; // 매 단어마다 알파벳 체크할 배열 초기화
            boolean result = false; // 알파벳이 안겹치는지 확인용 및 초기화

            for (int j = 0; j < arr.length; j++) {
                if (j < arr.length-1) { // 인덱스 조절
                    if (arr[j] == arr[j+1]) { // 연속될 경우
                        continue;

                    } else { // 연속되지 않으면
                        check[arr[j] - 97] += 1; // 알파벳 체크하는 배열 값에 1 더함
                    }
                } else if (j == arr.length-1) { // 마지막 원소일 때
                    check[arr[j] - 97] += 1;
                }

                if (check[arr[j]-97] == 2) { // 2이상일때
                    result = true;
                    break;
                }
            } // for j
            if (result == false) { // 2이상일때가 없을때
                cnt++;
            }
        } // for i
        System.out.println(cnt);
    }
}
