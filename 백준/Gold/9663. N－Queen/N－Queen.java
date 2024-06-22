import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] board = new int[N];
        putQueen(board,0);
        System.out.println(count);
    }
    public static void putQueen(int[] board, int row){
        if(row == N){
            count++;
            return;
        }
        for(int col = 0; col < N; col++){
            if(isPossible(board, row, col)){
                board[row] = col;
                putQueen(board, row + 1);
            }
        }
    }

    public static boolean isPossible(int[] board, int row, int col){
        for(int i = 0; i < row; i++){
//            같은 행, 열, 대각선 상에 있으면 공격 가능
            if(board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)){
                return false;
            }
        }
        return true;
    }
}
