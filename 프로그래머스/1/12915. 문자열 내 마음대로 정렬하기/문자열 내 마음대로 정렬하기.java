import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Map<String, String> map = new TreeMap<>();
        for(String a: strings){
            map.put(a.charAt(n)+a,a);
        }
        String[] answer = new String[strings.length];
        int count = 0;
        for(String a : map.values()){
            answer[count] = a;
            count++;
        }
        return answer;
    }
}