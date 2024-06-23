import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        bfs(begin, target, words);
        return answer;
    }
    public static int bfs(String begin, String target, String[] words){
        Queue<String> q = new LinkedList<>();
        boolean[] visited = new boolean[words.length];

        q.add(begin);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                String now = q.poll();
                if(now.equals(target)){
                    return answer;
                }
                for(int j = 0; j < words.length; j++){
                    if(!visited[j] && diff(now, words[j])){
                        visited[j] = true;
                        q.add(words[j]);
                    }
                }
            }
            answer++;
        }
        return answer = 0;
    }
    //    한글자만 다른 지 확인하는 메서드
    public static boolean diff(String word1, String word2){
        int diffCount = 0;
        for(int i = 0; i < word1.length(); i++){
            if(word1.charAt(i) != word2.charAt(i)){
                diffCount++;
            }
            if(diffCount > 1) return false;
        }
        return true;
    }
}