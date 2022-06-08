import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'c') { // c일때
                if (i + 1 < arr.length) {
                    if (arr[i+1] == '=' || arr[i+1] == '-') {
                        i++;
                    }
                }
            } else if (arr[i] == 'd') { // d일때
                if (i+1 < arr.length){
                    if (arr[i+1] == '-') {
                        i++;
                    } else if (arr[i+1] == 'z') {
                        if (i+2 < arr.length) {
                            if (arr[i+2] == '=') {
                                i+=2;
                            }
                        }
                    }
                }
            } else if (arr[i] == 'l') { // l일때
                if (i+1 < arr.length) {
                    if (arr[i+1] == 'j') {
                        i++;
                    }
                }
            } else if (arr[i] == 'n') { // n일때
                if (i+1 < arr.length) {
                    if (arr[i+1] == 'j') {
                        i++;
                    }
                }
            } else if (arr[i] == 's') { // s일때
                if (i+1 < arr.length) {
                    if (arr[i+1] == '=') {
                        i++;
                    }
                }
            } else if (arr[i] == 'z') { // z일때
                if (i+1 < arr.length) {
                    if (arr[i+1] == '=') {
                        i++;
                    }
                }
            }
        cnt++;
        }
        System.out.println(cnt);
    }
}
