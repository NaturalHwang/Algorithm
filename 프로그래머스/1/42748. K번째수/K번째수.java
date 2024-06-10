import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int start;
        int end;
        int [] answer = new int[commands.length];
            for(int c = 0; c < commands.length; c++){
                int i = commands[c][0];
                int j = commands[c][1];
                int k = commands[c][2];
                start = i-1;
                end = j;
                int []copy = Arrays.copyOfRange(array,start,end);
                Arrays.sort(copy);
                answer[c] = copy[k-1];
            }
            return answer;
    }
}