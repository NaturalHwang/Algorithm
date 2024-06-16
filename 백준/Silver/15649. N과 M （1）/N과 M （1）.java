import java.util.Scanner;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] perm;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N + 1];
        perm = new int[M];

        dfs(0);
    }
    public static void dfs(int depth){
        if(depth==M){
            for(int i = 0; i < M; i++){
                System.out.print(perm[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                visited[i] = true;
                perm[depth] = i;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
