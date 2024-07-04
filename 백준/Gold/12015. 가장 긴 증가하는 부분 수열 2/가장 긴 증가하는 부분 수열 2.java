import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        ArrayList<Integer> lis = new ArrayList<>();

        for(int num: nums){
            if(lis.isEmpty() || lis.get(lis.size()-1) < num){
                lis.add(num);
            } else{
                int pos = Collections.binarySearch(lis, num);
                if(pos <0){
                    pos = -(pos +1);
                }
                lis.set(pos, num);
            }
        }
        System.out.println(lis.size());
    }
}
