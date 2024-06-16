
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long start = 1;
        long end = 1;
        long sum = 1;
        int count = 1;
        while(end != N){
            if(sum==N){
                count++;
                end++;
                sum += end;
            } else if(sum < N){
                end++;
                sum += end;
            } else{
                sum-=start;
                start++;
            }
        }
        System.out.println(count);
    }
}
