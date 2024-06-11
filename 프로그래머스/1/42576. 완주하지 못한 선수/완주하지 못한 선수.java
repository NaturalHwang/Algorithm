import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> race = new HashMap<>();
        for(String a: participant){
            race.put(a, race.getOrDefault(a,0)+1);
        }
        for(String a: completion){
            race.put(a, race.getOrDefault(a,1)-1);
        }
        for(String a: race.keySet()){
            if(race.get(a)==1) {
                answer = a;
            }
        }
        return answer;
    }
}