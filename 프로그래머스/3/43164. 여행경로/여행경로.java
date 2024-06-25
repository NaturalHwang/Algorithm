import java.util.*;

class Solution {
    static boolean[] check;
    static List<String> result;
    static List<String> tmp;
    static boolean lastOrNot;

    public String[] solution(String[][] tickets) {
        result = new ArrayList<>();
        check = new boolean[tickets.length];
        tmp = new ArrayList<>();
        tmp.add("ICN");

        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        dfs("ICN", tickets, 0);

        return result.toArray(new String[0]);
    }

    public static void dfs(String start, String[][] tickets, int count) {
        if (lastOrNot) return;
        if (tmp.size() == tickets.length + 1) {
            result = new ArrayList<>(tmp);
            lastOrNot = true;
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!check[i] && tickets[i][0].equals(start)) {
                tmp.add(tickets[i][1]);
                check[i] = true;
                dfs(tickets[i][1], tickets, count + 1);
                tmp.remove(tmp.size() - 1);
                check[i] = false;
            }
        }
    }
}
