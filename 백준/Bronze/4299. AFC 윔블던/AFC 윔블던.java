import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int sub = sc.nextInt();

        if(sub>sum) System.out.println("-1");
        else{
            int a = (sum+sub)/2;
            int b = (sum-sub)/2;
            if(a + b == sum && a - b == sub){
                System.out.println(a + " " + b);
            } else System.out.println("-1");
        }
    }
}
