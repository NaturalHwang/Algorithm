import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < words.length; j++){
                if(babbling[i].contains(words[j])){
                    babbling[i] = babbling[i].replace(words[j], "!");
                }
            }
            if(babbling[i].contains("!")){
                babbling[i] = babbling[i].replace("!", "");
            }
            if(babbling[i]=="") answer++;
        }
        return answer;
    }
}