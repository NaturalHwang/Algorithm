import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int totalPrice = sc.nextInt();
        int total = sc.nextInt();

        for(int i = 0; i < total; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum+= a*b;
        }
        if(sum==totalPrice) System.out.println("Yes");
        else System.out.println("No");
    }
}
