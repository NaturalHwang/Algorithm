import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] score = new int[3];
        int sum = 0;
        int min;
        for(int i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
            sum += score[i];
        }
        if(sum < 100){
            min = Math.min(Math.min(score[0], score[1]), Math.min(score[1],score[2]));
            if(score[0] == min){
                System.out.println("Soongsil");
            } else if(score[1] == min){
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        } else System.out.println("OK");
    }
}
