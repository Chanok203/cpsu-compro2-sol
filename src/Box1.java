import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] caps = new int[N];
        int[] curs = new int[N];
        for (int i = 0; i < N; ++i) {
            caps[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        for (int k = 0; k < K; ++k) {
            int action = sc.nextInt();
            int Q = sc.nextInt();
            int B = sc.nextInt() - 1;

            if (action == 1) {
                if (curs[B] + Q <= caps[B]) {
                    curs[B] += Q;
                    System.out.println(curs[B]);
                } else {
                    System.out.println(-1);
                }
            } else if (action == 2) {
                if (Q <= curs[B]) {
                    curs[B] -= Q;
                    System.out.println(curs[B]);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
