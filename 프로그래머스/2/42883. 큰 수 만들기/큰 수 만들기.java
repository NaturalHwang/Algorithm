import java.util.*;

class Solution {
    static int min = 9;
    static int index;
    static int count = 0;
    public String solution(String number, int k) {
        char[] arr = number.toCharArray();
        List<String> num = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            num.add(String.valueOf(arr[i]));
            min = Math.min(min, Integer.parseInt(String.valueOf(arr[i])));
            if(num.size()==k && count!= k){
                index = num.indexOf(String.valueOf(min));
                num.remove(index);
                count++;
                min = Integer.parseInt(num.get(0));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s : num){
            sb.append(s);
        }
        String answer = String.valueOf(sb);
        return answer;
    }
}