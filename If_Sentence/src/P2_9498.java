import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String result = (90<=input && input<=100)? "A" : (80<=input && input<90)? "B" : (70<=input && input<80)? "C" : (60<=input && input<70)? "D" : "F";
        System.out.println(result);
    }
}
