import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            int[] prices = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                prices[j] = Integer.parseInt(st.nextToken());
            }
            long earn = 0;
            int max = 0;
            for(int k = N-1; k >=0; k--){
                if(prices[k] > max){
                    max = prices[k];
                } else{
                    earn += max - prices[k];
                }
            }
            System.out.println(earn);
        }
    }
}
