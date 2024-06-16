import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] num = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] sumArr = new int[N];
        sumArr[0] = num[0];
        for (int i = 1; i < N; i++) {
            sumArr[i] = sumArr[i - 1] + num[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int sum;
            if (start == 1) {
                sum = sumArr[end - 1];
            } else {
                sum = sumArr[end - 1] - sumArr[start - 2];
            }
            sb.append(sum).append("\n");
        }

        System.out.print(sb);

        br.close();
    }
}
