import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        LinkedList<Integer> tempList = new LinkedList<>();
        for (int person : people) {
            tempList.add(person);
        }

        int cnt = 0;
        while (!tempList.isEmpty()) {
            int min = tempList.getFirst();
            int max = tempList.getLast();
            if (max + min <= limit) {
                if (tempList.size() == 1) {
                    tempList.removeLast();
                    cnt++;
                } else {
                    tempList.removeLast();
                    tempList.removeFirst();
                    cnt++;
                }
            } else {
                tempList.removeLast();
                cnt++;
            }
        }
        return cnt;
    }
}
