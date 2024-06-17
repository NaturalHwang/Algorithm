import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> (b + a).compareTo(a + b));
        for(int n: numbers){
            pq.add(String.valueOf(n));
        }
        if(pq.peek().equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()){
            sb.append(pq.poll());
        }
        return sb.toString();
    }
}