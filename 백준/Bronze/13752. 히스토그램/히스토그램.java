import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            int input = sc.nextInt();
            for(int j = 0; j < input; j++){
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
