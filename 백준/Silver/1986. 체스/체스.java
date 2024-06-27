import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};  
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};  
    static int[] kdx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] kdy = {1, 2, 2, 1, -1, -2, -2, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        boolean[][] board = new boolean[row][col];
        List<int[]> queens = new ArrayList<>();
        List<int[]> knights = new ArrayList<>();
        List<int[]> pawns = new ArrayList<>();

        int queenCount = sc.nextInt();
        for (int i = 0; i < queenCount; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            queens.add(new int[]{x, y});
            board[x][y] = true;
        }

        int knightCount = sc.nextInt();
        for (int i = 0; i < knightCount; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            knights.add(new int[]{x, y});
            board[x][y] = true;
        }

        int pawnCount = sc.nextInt();
        for (int i = 0; i < pawnCount; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            pawns.add(new int[]{x, y});
            board[x][y] = true;
        }
        boolean[][] isAttack = new boolean[row][col];

        for(int[] queen : queens){
            for(int i = 0; i < 8; i++){
                int nx = queen[0];
                int ny = queen[1];
                while(true){
                    nx += dx[i];
                    ny += dy[i];
                    if(nx >= row || ny >= col || nx < 0 || ny < 0 || board[nx][ny]) break;
                    isAttack[nx][ny] = true;
                }
            }
        }
        for(int[] knight : knights){
            for(int i = 0; i < 8; i++){
                int nx = knight[0] + kdx[i];
                int ny = knight[1] + kdy[i];
                if(nx >= 0 && ny >= 0 && nx < row && ny < col  && !board[nx][ny]){
                    isAttack[nx][ny] = true;
                }
            }
        }
        for (int[] queen : queens) isAttack[queen[0]][queen[1]] = true;
        for (int[] knight : knights) isAttack[knight[0]][knight[1]] = true;
        for (int[] pawn : pawns) isAttack[pawn[0]][pawn[1]] = true;

        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(!isAttack[i][j]) count++;
            }
        }
        System.out.println(count);
    }
}
