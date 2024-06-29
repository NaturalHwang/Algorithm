import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int s = Integer.parseInt(br.readLine());

        for(int i = 0; i < n-1; i++){
            if(s<=0) break;
            int max = i;
            for(int j = i +1; j <= Math.min(n-1, i + s); j++){
                if(arr[j] > arr[max]){
                    max = j;
                }
            }
            while(max > i){
                int temp = arr[max];
                arr[max] = arr[max-1];
                arr[max-1] = temp;
                max--;
                s--;
                if(s == 0) break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
