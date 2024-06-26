import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long left = 1;
        long right = (long)times[times.length - 1]*n;
        long answer = right;

        while(left<= right){
            long mid = left + (right - left)/2;
            long sum = 0;
//            System.out.println(mid);

            for(int time: times){ // 각 심사관이 심사할 수 있는 사람 수 계산
                sum += mid / time;
                //System.out.println(sum);
            }
            if(sum >= n){
                answer = mid;
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
//        System.out.println(answer);
        return answer;
    }
}