import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P6_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] input = new int[2]; // 배열은 항상 뒤에 new로 선언해줘야함
        StringTokenizer st = new StringTokenizer(br.readLine()); // 이렇게 하면 따로 들어와짐
        for (int i = 0; i < 2; i++) {
            input[i] = Integer.parseInt(st.nextToken()); // nextToken
        }
        int num = Integer.parseInt(br.readLine());
//        System.out.println();
//        System.out.println((num+input[1]) / 60);

        if (num + input[1] >=60) {
            if ( (input[0] +(num+input[1]) / 60) > 23 ) {
                System.out.println( (input[0] +(num+input[1]) / 60 )-24+ " " + ((num+input[1]) % 60)  );

            } else {
                System.out.println((input[0] +(num+input[1]) / 60 )+ " " + ((num+input[1]) % 60)  );
            }
        } else {
            System.out.println(input[0] + " " + (input[1] + num));
        }
    }
}
