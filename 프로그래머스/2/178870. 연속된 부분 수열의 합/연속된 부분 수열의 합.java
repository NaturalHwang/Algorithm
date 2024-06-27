import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {};
        int start = 0;
        int end = 0;
        int sum = sequence[0];
        int minLength = Integer.MAX_VALUE;
        List<int[]> list = new ArrayList<>();
        while(start <= end && end < sequence.length){
            if(sum == k){
                if(minLength > end-start) minLength = end - start;
                list.add(new int[]{start, end});
                sum -= sequence[start];
                start++;
            } else if(sum < k && end < sequence.length-1){
                end++;
                sum += sequence[end];
            } else{
                sum -= sequence[start];
                start++;
            }
        }
        for(int[] arr : list){
            if(arr[1]-arr[0] == minLength){
                answer = arr;
                break;
            }
        }
        return answer;
    }
}