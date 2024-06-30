import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        int m =  sc.nextInt();
        for(int i = 0; i < m; i++){
            long target = sc.nextLong();
            if(BS(arr, target)){
                System.out.println(1);
            } else{
                System.out.println(0);
            }
        }
    }
    public static boolean BS(long[]arr, long target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return true;
            } else if(arr[mid] > target){
                right = mid -1;
            } else{
                left = mid + 1;
            }
        }
        return false;
    }
}
