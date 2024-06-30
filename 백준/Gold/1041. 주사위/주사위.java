import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n =  sc.nextLong();
        int[] num = new int[6];
        for(int i = 0; i < 6; i++){
            num[i] = sc.nextInt();
        }

        if(n == 1){
            int max = 0;
            int sum = 0;
            for(int i = 0; i < 6; i++){
                sum += num[i];
                if(num[i] > max){
                    max = num[i];
                }
            }
            System.out.println(sum - max);
            return;
        }
        long min1 = Integer.MAX_VALUE;
        long min2 = Integer.MAX_VALUE;
        long min3 = Integer.MAX_VALUE;

//        1면의 합 최소
        for(int i = 0; i < 6; i++){
            if(num[i] < min1){
                min1 = num[i];
            }
        }
//        2면의 합 최소
        int[][] twoPair = {{0,1},{0,2},{0,3},{0,4},{1,2},{1,3},{1,5},{2,4},{2,5},{3,4},{3,5},{4,5}};
        for(int[]pair : twoPair){
            long sum = num[pair[0]] + num[pair[1]];
            if(sum < min2){
                min2 = sum;
            }
        }
//        3면의 합 최소
        int[][] triple = {{0, 1, 2}, {0, 1, 3}, {0, 2, 4}, {0, 3, 4}, {0, 3, 4}, {1, 2, 5}, {1, 3, 5}, {2, 4, 5}, {3, 4, 5}};
        for(int[]pair : triple){
            long sum = num[pair[0]] + num[pair[1]] + num[pair[2]];
            if(sum < min3){
                min3 = sum;
            }
        }
        long one = (5 * n - 6) * (n -2);
        long two = (8 * (n-2) + 4);
        long three = 4;

        long answer = one * min1 + two * min2 + three * min3;
        System.out.println(answer);
    }
}
