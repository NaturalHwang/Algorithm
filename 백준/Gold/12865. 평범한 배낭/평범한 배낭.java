import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] weight = new int[n+1];
        int[] values = new int[n+1];
        int[][] dp = new int[n+1][k+1];

        for(int i = 1; i <= n; i++){
            weight[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(weight));
//        System.out.println(Arrays.toString(values));
        for(int i = 1; i<= n; i++){
            for(int j = 0; j <= k; j++){
                if(weight[i] <= j){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight[i]] + values[i]);
//                    System.out.println(i+", "+j+", "+weight[i]+", "+values[i]);
                } else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
//        System.out.println(Arrays.deepToString(dp));
        System.out.println(dp[n][k]);
    }
}
