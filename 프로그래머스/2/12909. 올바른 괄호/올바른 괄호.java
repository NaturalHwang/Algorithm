import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()) {
            if(c == '('){
                st.push(c);
            } else if(c ==')'){
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}