import java.util.*;

class Solution { 
    public static int solution(int[] scoville, int K) {
        Queue<Integer> pq = new PriorityQueue<>();
        int first;
        int second;
        int count = 0;
        for(int i : scoville){
            pq.add(i);
        }
        if(pq.peek()>=K){
            return count;
        } else{
            while(pq.peek()<K){
                first = pq.poll();
                if(pq.size()<1){
                    return -1;
                }
                else{
                    second = pq.poll();
                    pq.add((second*2) + first);
                    count++;
                }
            }
        }
        if(pq.peek()<K) return -1;
        else return count;
    }
}