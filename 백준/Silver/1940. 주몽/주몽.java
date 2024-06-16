import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int []materials = new int[N];
        for(int i = 0; i < N; i++){
            materials[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(materials);
        int start = 0;
        int end = N-1;
        int count = 0;

        while(start < end){
            if(materials[start] + materials[end] < M) start++;
            else if(materials[start] + materials[end] > M) end--;
            else {
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);
    }
}
