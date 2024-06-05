import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

        int n = Integer.parseInt(br.readLine());
        int a, b;
        int sum = 0;

        for(int i = 0; i < n; i++){
            try {
                // 첫 줄에서 m과 n을 입력받음
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                sum = a + b;

                bw.write(sum + "\n");
            } catch (IOException e){
                System.out.println(" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
