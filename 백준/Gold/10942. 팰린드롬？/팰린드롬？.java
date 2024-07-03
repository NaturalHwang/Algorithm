import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n+1];
        for(int i = 1; i <= n; i++){
            nums[i] = sc.nextInt();
        }

//        한자리 펠린드롬
        boolean[][] dp = new boolean[n+1][n+1];
        for(int i = 1; i <= n; i++){
            dp[i][i] = true;
        }
//        두자리 펠린드롬
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i+1]){
                dp[i][i+1] = true;
            }
        }
//        세자리 이상
        for(int i = 3; i <= n; i++){
            for(int start = 1; start<= n - i + 1; start++){
                int end = start + i - 1;
//                시작과 끝이 같고 그 사이가 펠린드롬이면 true
                if(nums[start] == nums[end] && dp[start+1][end-1]){
                    dp[start][end] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            if(dp[start][end]){
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}