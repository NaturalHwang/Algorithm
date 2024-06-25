import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        Arrays.fill(students, 0);

        for (int l : lost) {
            students[l - 1]--;
        }
        for (int r : reserve) {
            students[r - 1]++;
        }

        for (int i = 0; i < n; i++) {
            if (students[i] == -1) {
                if (i > 0 && students[i - 1] == 1) {
                    students[i]++;
                    students[i - 1]--;
                } else if (i < n - 1 && students[i + 1] == 1) {
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }

        int answer = 0;
        for (int student : students) {
            if (student >= 0) {
                answer++;
            }
        }

        return answer;
    }
}