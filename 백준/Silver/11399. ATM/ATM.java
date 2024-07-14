import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }

        Arrays.sort(times);

        int totaltime = 0;
        int accumulatedTime = 0;

        for (int i = 0; i < n; i++) {
           
            totaltime += times[i] * (n - i);
        }

        System.out.println(totaltime);
    }
}
