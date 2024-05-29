import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int left = 0, right = 0, count= 0, sum = 0;

        List<Integer> primeList = getPrime(n);

        while(left < primeList.size()){
            if(right==primeList.size()) right--;
            sum += primeList.get(right);
            if(sum==n){
                count++;
                sum = 0;
                left++;
                right = left;
            } else if(sum > n){
                sum = 0;
                left++;
                right = left;
            } else right++;
        }
        System.out.print(count);
    }

    public static List<Integer> getPrime(int n){
        boolean[] isPrime = new boolean[n+1];
        int sqrt = (int) Math.sqrt(n);
        for(int i = 0; i<=n; i++){
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;
        for(int i = 2; i<= sqrt; i++){
            if(isPrime[i]){
                for(int j = i*i; j <= isPrime.length-1; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primeList = new ArrayList<>();
        for(int i = 0; i < isPrime.length; i++){
            if(isPrime[i]) primeList.add(i);
        }
        return primeList;
    }
}
