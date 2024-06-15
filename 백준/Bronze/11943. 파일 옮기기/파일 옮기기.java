import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] box = new int[2][2];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < box.length; i++){
            box[i][0] = sc.nextInt();
            box[i][1] = sc.nextInt();
        }
        sum1 = box[0][0] + box[1][1];
        sum2 = box[0][1] + box[1][0];
        System.out.println(Math.min(sum1,sum2));
    }
}
