import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        long z = 100 * y / x;

        if(z >= 99) System.out.println(-1);
        else{
            long left = 0;
            long right = x;
            long answer = Integer.MIN_VALUE;

            while(left <= right){
                long mid = (left + right) / 2;
                long newZ = 100 * (y + mid) / (x + mid);

                if(newZ > z){
                    answer = mid;
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
            System.out.println(answer);
        }
    }
}
