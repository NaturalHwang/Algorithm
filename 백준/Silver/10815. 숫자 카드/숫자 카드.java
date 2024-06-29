import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < m; i++){
            boolean hasNum = binarySearch(num, Integer.parseInt(st.nextToken()));
            if(hasNum) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
    public static boolean binarySearch(int[] num, int target){
        int left = 0;
        int right = num.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(num[mid] == target){
                return true;
            } else if(num[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return false;
    }
}
