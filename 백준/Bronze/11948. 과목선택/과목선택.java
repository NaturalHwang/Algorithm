import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();

        int min1 = Math.min(Math.min(A,B), Math.min(C,D));
        int min2 = Math.min(E,F);
        System.out.println(A+B+C+D+E+F-min1-min2);
    }
}
