class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] num = new int[n+1];
        for(int i = 1; i <= n; i++){
            num[i] = i;
        }
        int start = 1;
        int end = 1;
        int sum = num[start];
        while(start <= end){
            if(sum == n){
                answer++;
                sum -= num[start];
                start++;
            } else if(sum < n && end < num.length-1){
                end++;
                sum += num[end];
            } else{
                sum -= num[start];
                start++;
            }
        }
        return answer;
    }
}