import java.util.*;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> phone = new HashSet<>();
        for(int i : nums){
            phone.add(i);
        }
        int answer = 0;
        if(phone.size()>nums.length/2){
            answer = nums.length/2;
        }else answer = phone.size();
        return answer;
    }
}