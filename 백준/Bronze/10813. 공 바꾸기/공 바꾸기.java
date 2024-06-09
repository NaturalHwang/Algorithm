import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int []arr = new int[N];

        for(int a = 0; a < N; a++){
            arr[a] = a + 1;
        }
        for(int b = 0; b < M; b++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = 0;

            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }
        for(int c = 0; c < N; c++){
            System.out.print(arr[c] + " ");
        }
    }
}
