import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeSet<Long> deN = new TreeSet<>();
        for(int i = 0; i < 10; i++){
            deN.add((long) i);
        }
        for(int leng = 2; leng < 11; leng++){
            for(int start = 1; start < 10; start++){
                makeDeN(start, leng, deN);
            }
        }
        Long[] deNArray = deN.toArray(new Long[0]);
        if(n >= deNArray.length || n < 0) System.out.println(-1);
        else System.out.println(deNArray[n]);
    }
    public static void makeDeN(long num, int length, TreeSet<Long> deN){
        if(String.valueOf(num).length() == length){
            deN.add(num);
            return;
        }
        int lastNum = (int)(num % 10);

        for (int i = lastNum - 1; i >= 0; i--) {
            makeDeN(num * 10 + i, length, deN);
        }
    }
}
