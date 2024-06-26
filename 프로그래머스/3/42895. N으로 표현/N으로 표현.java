import java.util.*;

class Solution {
    public int solution(int N, int number) {
        int answer = -1;
        HashSet<Integer>[] dp = new HashSet[9];
        for(int i = 0; i < 9; i++){
            dp[i] = new HashSet<>();
            dp[i].add(repeatNum(N,i));
        }
        for(int i = 1; i < 9; i++){
            for(int j = 1; j < i; j++){
                combiSet(dp[i], dp[j], dp[i-j]);
            }
            if(dp[i].contains(number)){
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static int repeatNum(int N, int count){
        int result = 0;
        for(int i = 0; i < count; i++){
            result = result * 10 + N;
        }
        return result;
    }

    public static void combiSet(Set<Integer> result, Set<Integer> set1, Set<Integer> set2){
        for(int i : set1){
            for(int j : set2){
                result.add(i + j);
                result.add(i - j);
                result.add(i * j);
                if(j != 0) result.add(i / j);
            }
        }
    }
}