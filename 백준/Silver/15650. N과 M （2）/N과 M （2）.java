import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] combi;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        combi = new int[M];

        dfs(0,1);
    }
    public static void dfs(int depth, int start){
        if(depth==M){
           for(int i = 0; i < M; i++){
               System.out.print(combi[i] + " ");
           }
            System.out.println();
            return;
        }
        for(int i = start; i <= N; i++){
            combi[depth] = i;
            dfs(depth+1, i+1);
        }
    }
}
