import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        
        if(M > 0){
            for(int i = 0; i < N; i++){
                char[] boong = sc.next().toCharArray();
                for(int j = M -1; j >= 0; j--){
                    System.out.print(boong[j]);
                }
                System.out.println();
            }
        }
    }
}
