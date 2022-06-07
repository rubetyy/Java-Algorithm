import java.io.IOException;

public class P2_4673 {
    public static void main(String[] args) throws IOException {
        boolean[] check = new boolean[10001]; // bool 배열 만들어 놓고
        for (int i = 0; i < 10001; i++) {
            int n = d(i); // return 된 값을 n에 저장
            if (n < 10001) {
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder(); // sb로 한번에 출력하기위함
        
        for (int i = 1; i < 10001; i++) {
            if (check[i] == false) {
                sb.append(i).append('\n'); // 인덱스를 그 수로 생각
            }
        }
        System.out.println(sb);
    }
    public static int d(int number) {
        int sum = number;
        
        while (number != 0){ // 자리수 줄이며 0이 될때까지
            sum = sum + number%10; // 기본 숫자에 맨 뒷자리수 더해줌
            number = number/10; // 자리수 줄여줌
        }
        return sum;
    }

}
