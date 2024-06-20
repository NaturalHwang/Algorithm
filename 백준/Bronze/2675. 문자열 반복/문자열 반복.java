import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int a = 0; a < n; a++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            for(int i = 0; i < word.length(); i++){
                String temp = String.valueOf(word.charAt(i));
                for(int j = 0; j < count; j++){
                    System.out.print(temp);
                }
            }
            System.out.println();
        }
    }
}
