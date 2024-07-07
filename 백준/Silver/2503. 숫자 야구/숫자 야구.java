import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] guessNum = new int[n][3];
        
        for (int i = 0; i < n; i++) {
            guessNum[i][0] = sc.nextInt();
            guessNum[i][1] = sc.nextInt();
            guessNum[i][2] = sc.nextInt();
        }

        int count = 0;

        for (int i = 123; i <= 987; i++) {
            if (isValid(i)) {
                boolean isPossible = true;
                for (int j = 0; j < n; j++) {
                    int strike = getStrike(i, guessNum[j][0]);
                    int ball = getBall(i, guessNum[j][0]);
                    if (strike != guessNum[j][1] || ball != guessNum[j][2]) {
                        isPossible = false;
                        break;
                    }
                }
                if (isPossible) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isValid(int num) {
        String str = String.valueOf(num);
        if (str.contains("0")) return false;
        if (str.charAt(0) == str.charAt(1) || str.charAt(1) == str.charAt(2)
                || str.charAt(0) == str.charAt(2)) return false;
        return true;
    }

    public static int getStrike(int guess, int answer) {
        String strGuess = String.valueOf(guess);
        String strAnswer = String.valueOf(answer);
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (strGuess.charAt(i) == strAnswer.charAt(i)) {
                strike++;
            }
        }
        return strike;
    }

    public static int getBall(int guess, int answer) {
        String strGuess = String.valueOf(guess);
        String strAnswer = String.valueOf(answer);
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (strGuess.charAt(i) != strAnswer.charAt(i) &&
                    strAnswer.contains(String.valueOf(strGuess.charAt(i)))) {
                ball++;
            }
        }
        return ball;
    }
}
