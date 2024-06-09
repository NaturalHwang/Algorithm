import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int []arr = new int[N];
        int temp;

        for(int a = 0; a < N; a++){
            arr[a] = a+1;
        }
        for(int b = 0; b < M; b++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            if(i==j) continue;

            for(int c = i; c < j; c++){
                temp = arr[j-1];
                arr[j-1] = arr[c-1];
                arr[c-1] = temp;
                j--;
            }
        }
        for(int n = 0; n < N; n++){
            System.out.print(arr[n] + " ");
        }
    }
}
