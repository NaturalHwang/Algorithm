class Solution {
    static int N;
    static int count = 0;
    public int solution(int n) {
        N = n;
        int[] board = new int[n];
        putQueen(board, 0);
        int answer = count;
        return answer;
    }
    public static void putQueen(int[] board, int row){
        if(row == N){
            count++;
            return;
        }
        for(int i = 0; i < N; i++){
            if(isAttack(board,i,row)){
                board[row] = i;
                putQueen(board,row+1);
            }
        }
    }
    public static boolean isAttack(int[] board, int col, int row){
        for(int i = 0; i < row; i++){
            if(col == board[i] || Math.abs(i -row) == Math.abs(col - board[i])){
                return false;
            }
        }
        return true;
    }
}