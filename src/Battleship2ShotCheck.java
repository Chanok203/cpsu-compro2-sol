import java.util.Scanner;

public class Battleship2ShotCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int out = 0;
        for (int k = 0; k < K; k++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            boolean isValidR = (0 <= r) && (r < R);
            boolean isValidC = (0 <= c) && (c < C);
            if (!isValidR || !isValidC) {
                out++;
            }
        }
        int in = K - out;
        System.out.println(in);
        System.out.println(out);
    }
}