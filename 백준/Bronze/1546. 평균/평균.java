import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        double sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int maxScore = arr[N - 1];

        for (int i = 0; i < N; i++) {
            double newScore = (double) arr[i] / maxScore * 100;
            sum += newScore;
        }

        double avg = sum / N;
        System.out.println(avg);
    }
}
