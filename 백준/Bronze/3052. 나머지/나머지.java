import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[42];
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            int n = sc.nextInt();

            arr[n%42]++;
        }
        for(int j = 0; j < 42; j++){
            if(arr[j]!=0) cnt++;
        }
        System.out.println(cnt);
    }
}
