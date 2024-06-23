public class Main {
    public static void main(String[] args) {
        boolean[] isSelf = new boolean[10001];

        for(int i = 1; i <= 10000; i++){
            int dn = d(i);
            if(dn <= 10000){
                isSelf[dn] = true;
            }
        }
        for(int i = 1; i <= 10000; i++){
            if(!isSelf[i]){
                System.out.println(i);
            }
        }
    }
    public static int d(int n){
        int sum = n;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
