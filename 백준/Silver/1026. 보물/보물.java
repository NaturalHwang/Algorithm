import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for(int i = 0; i < n; i++){
            arrA[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            arrB[i] = sc.nextInt();
        }
        Arrays.sort(arrA);
        int[]newB = Arrays.stream(arrB)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arrA[i] * newB[i];
        }
        System.out.println(sum);
    }
}
