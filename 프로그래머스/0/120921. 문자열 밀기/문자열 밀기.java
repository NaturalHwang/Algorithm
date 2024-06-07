class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String temp1 = "";
        StringBuilder sb1 = new StringBuilder(A);
        for(int i = 0; i < A.length(); i++){
            if(sb1.toString().equals(B)) break;
            temp1 = sb1.substring(A.length()-1,A.length());
            sb1.delete(A.length()-1,A.length());
            sb1.insert(0,temp1);
            answer++;
            if(sb1.toString().equals(B)) break;
        }
        if(!sb1.toString().equals(B)) answer = -1;
        return answer;
    }
}