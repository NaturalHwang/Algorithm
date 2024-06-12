import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
    List<Integer> answerList = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(st.peek()!=arr[i]) st.push(arr[i]);
        }
        while(!st.isEmpty()){
            answerList.add(st.pop());
        }
        Collections.reverse(answerList);
        int[] answer = new int[answerList.size()];
        for(int i = 0; i <answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}