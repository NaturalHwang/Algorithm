import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            long N = sc.nextLong();
            System.out.println(BS(N));
        }
    }
    public static long BS(long num){
        long left = 1;
        long right = (long) Math.sqrt(2 * num);
        long answer = 0;

        while(left <= right){
            long mid = (left + right) / 2;
            long sum = mid * (mid + 1) / 2;

            if(sum <= num){
                answer = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
        return answer;
    }
}
