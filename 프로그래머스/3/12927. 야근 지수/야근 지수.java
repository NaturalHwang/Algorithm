import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int work : works){
            pq.add(work);
        }

        while (n > 0 && !pq.isEmpty()){
            int max = pq.poll();
            if(max > 0){
                pq.add(max-1);
            }
            n--;
        }
        for(int work: pq){
            answer += (long)work * work;
        }
        return answer;
    }
}