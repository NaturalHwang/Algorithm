import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer>answerList = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(answerList.contains(numbers[i]+numbers[j])) continue;
                else answerList.add(numbers[i]+numbers[j]);
            }
        }
        Collections.sort(answerList);
        int []answer = new int[answerList.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}