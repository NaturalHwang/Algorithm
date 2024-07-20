import java.util.Scanner;

public class Main {
    static int N, M;
    static char[][] field;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  

        for (int t = 0; t < T; t++) {
            N = scanner.nextInt();  
            M = scanner.nextInt();  
            scanner.nextLine(); 

            field = new char[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < N; i++) {
                String line = scanner.nextLine();
                for (int j = 0; j < M; j++) {
                    field[i][j] = line.charAt(j);
                }
            }

            int sheep = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (field[i][j] == '#' && !visited[i][j]) {
                        dfs(i, j);
                        sheep++;
                    }
                }
            }

            System.out.println(sheep);
        }

        scanner.close();
    }
    
    private static void dfs(int x, int y) {
        if (x < 0 || x >= N || y < 0 || y >= M || visited[x][y] || field[x][y] == '.') {
            return;
        }

        visited[x][y] = true;

        dfs(x - 1, y);  // 위
        dfs(x + 1, y);  // 아래
        dfs(x, y - 1);  // 왼쪽
        dfs(x, y + 1);  // 오른쪽
    }
}
